package com.sparta.generics;

public class GenericsDriver {
    public static void main(String[] args) {
        ObjectCache<Long> cache = new ObjectCache<>();
//        ObjectCache<String> strCache = new ObjectCache<>();
//        strCache.setTheObject("Sparta!");
        cache.setTheObject(new Long(5));
        System.out.println(cache.asDouble());
        System.out.println(cache.getTheObject());
    }
}
