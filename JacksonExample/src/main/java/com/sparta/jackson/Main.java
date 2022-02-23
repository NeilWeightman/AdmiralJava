package com.sparta.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objMap = new ObjectMapper();
        try {
            Guardian myObj = objMap.readValue(
                    new URL("https://content.guardianapis.com/search?api-key=401eae2b-af0e-455f-b4a8-2b9e3229b7bd"),
                    Guardian.class);
            TopStories stories = myObj.getResponse();
            List<NewsItem> theNews = stories.getResults();
            for(NewsItem newsItem: theNews){
                System.out.println(newsItem.getWebTitle());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
