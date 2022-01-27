package com.sparta.oop;

import java.util.ArrayList;
import java.util.Collections;

public class InterfaceExample {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Stephen");
        strList.add("Andrew");
        strList.add("Mehmet");
        strList.add("Autumn");
        Collections.sort(strList);
        System.out.println(strList);

        ArrayList<Customer> custList = new ArrayList<>();
        custList.add(new Customer("Aiden", "Sykes", 4));
        custList.add(new Customer("Jack", "Gilbride", 44));
        custList.add(new Customer("Dale", "Bernardo", 28));
        custList.add(new Customer("Piotr", "Sulek", 81));
        custList.add(new Customer("Natasha", "Reilly", 17));
        Collections.sort(custList);
        System.out.println(custList);
    }
}
