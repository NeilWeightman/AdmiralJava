package com.sparta.nested;

import java.util.*;

public class NestedDriver {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>(List.of("Brandon Johnson", "Aiden Sykes", "Donovan Cupueran",
                "Alvaro Gonzalez", "Andrew Murray",
                "Conor Porteous", "Antony Ademefun", "Autumn Peles", "Ben Wong",
                "Dale Bernardo", "Autumn Peles"));
        for (String name: s){
            System.out.println(name);
        }
        System.out.println(s);

        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("Dale", new Customer("Dale", "Bernardo"));
        System.out.println(customerMap);
        customerMap.put("Andrew", new Customer("Andrew", "Murray"));
        for (Customer customer: customerMap.values())
            System.out.println(customer);
        System.out.println(customerMap);
    }
}
