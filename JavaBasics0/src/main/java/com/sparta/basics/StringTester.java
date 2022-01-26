package com.sparta.basics;

public class StringTester {
    public static void main(String[] args) {
        String name = "Autumn Peles";
        System.out.println("The person's name is: " + name.substring(7));
        String surname = name.substring(7); // doesn't create a new object, refers to original String, offset 7
//        name = null; // can't delete the String because part of it is in use

        surname = new String(name.substring(7)); // in the heap, full name can be garbage collected
//        String newName = new String(name);
        System.out.printf("The name is: %s", surname);

    }
}
