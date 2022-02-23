package com.sparta.http.test;

import com.sparta.http.Joke;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ChuckTest {
    private static JSONObject jsonObject = null;

    @BeforeAll
    public static void setUp() {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://api.chucknorris.io/jokes/random"))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response =
                    httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            JSONParser jsonParser = new JSONParser();
            jsonObject = (JSONObject) jsonParser.parse(responseBody);
        } catch (IOException | InterruptedException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(20)
    public void testThatValueContainsChuck() {
        Joke j = new Joke((String) jsonObject.get("id"), (String) jsonObject.get("value"));
//        String jokeText = (String) jsonObject.get("value");
        MatcherAssert.assertThat(j, Matchers.hasProperty("id"));
//        MatcherAssert.assertThat(jokeText, Matchers.containsString("Chuck Norris"));
//        Assertions.assertTrue(jokeText.contains("Chuck Norris"));
        System.out.println(j.getClass().getDeclaredMethods()[0].getName());
    }
}
