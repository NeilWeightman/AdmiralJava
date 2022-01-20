package com.sparta.test;

public class Example {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.getMessage("Neil"));
    }

    public String getMessage(String name){
        return "Welcome to Sparta, " + name;
    }
}
