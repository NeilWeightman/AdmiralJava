package com.sparta.http;

import java.io.Serializable;

public class Joke implements Serializable {
    private String id;
    private String jokeText;

    public Joke() {
    }

    public Joke(String id, String jokeText) {
        this.id = id;
        this.jokeText = jokeText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJokeText() {
        return jokeText;
    }

    public void setJokeText(String jokeText) {
        this.jokeText = jokeText;
    }
}
