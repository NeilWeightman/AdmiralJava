package com.sparta.oop;

import com.sparta.shapes.Circle;

import java.util.ArrayList;
import java.util.Random;

public class PolyExample {

    public static void main(String[] args) {
        ArrayList<Object> objList = new ArrayList<>();
        Random r = new Random();
        for(int i = 1; i < 100; i++){
            if(r.nextDouble()<.3)
                objList.add("Hello");
            else
                objList.add(new Customer("Neil", "Weightman", 1234));
        }
        System.out.println(objList);
        Object o = new Customer();

        Person p = new Customer();
    }

}
