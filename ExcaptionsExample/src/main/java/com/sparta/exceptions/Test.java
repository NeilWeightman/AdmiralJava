package com.sparta.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //using the parameterised type of ArrayList (using Generics)
        List<String> l = new ArrayList<>(List.of("Aiden Sykes", "Alvaro Gonzalez", "Andrew Murray",
                    "Antony Ademefun", "Autumn Peles", "Ben Wong", "Brandon Johnson",
                    "Conor Porteous", "Dale Bernardo", "Donovan Cupueran"));
        // l.add(new Cat()); // can't add a Cat
        // Cat c = (Cat)l.get(9); // can't get a Cat, only contains Strings
        System.out.println(l.get(8));
        System.out.println(l);
    }
}
