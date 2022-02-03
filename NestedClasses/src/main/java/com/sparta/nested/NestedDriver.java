package com.sparta.nested;

import java.util.ArrayList;
import java.util.List;

public class NestedDriver {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("Brandon Johnson", "Aiden Sykes", "Donovan Cupueran",
                "Alvaro Gonzalez", "Andrew Murray",
                "Conor Porteous", "Antony Ademefun", "Autumn Peles", "Ben Wong",
                "Dale Bernardo"));
        System.out.println(l);
        MySorter<Comparable> theComparableSorter = new MySorter<>();
        theComparableSorter.sort(l);
        System.out.println(l);

        List<Customer> custList = new ArrayList<>(List.of(new Customer("Brandon", "Johnson"),
                new Customer("Aiden", "Sykes"), new Customer("Donovan", "Cupueran"),
                new Customer("Alvaro", "Gonzalez"), new Customer("Andrew", "Murray"),
                new Customer("Conor", "Porteous"), new Customer("Antony", "Ademefun"),
                new Customer("Autumn", "Peles"), new Customer("Ben", "Wong"),
                new Customer("Dale", "Bernardo")));
        System.out.println(custList);
        MySorter<Customer> theCustomerSorter = new MySorter<>();
        theCustomerSorter.sortCustomers(custList);
        System.out.println(custList);
    }
}
