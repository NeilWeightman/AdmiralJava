package com.sparta.basics;

public class ConcatExample {
    public static void main(String[] args) {
        String[] names = {"Aiden", "Alvaro", "Andrew", "Antony", "Autumn",
                "Ben", "Brandon", "Conor", "Dale"};
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < names.length; i++) {
            names[i] = i + ":" + names[i];
            result.append(names[i]);
            result.append(", ");
        }
        System.out.println(result); // calls toString() on result
        for(String name: names)
            System.out.println(name);
    }
}
