package com.sparta.basics;

public class JavaBasics {
    public static void main(String[] args) {
        int myIndex = 0; // default integer type
        // float, boolean, byte, char, short, long, double (default floating point type) <-- primitive types
        // String <-- not primitive, capitalised therefore class
        boolean isOpen = true;
        String name = "Conor";
        String anotherName = "Conor"; // refers to the same String, works because STRINGS ARE IMMUTABLE
        anotherName = name.toUpperCase(); // creates a new String with the upper case letters
        System.out.println("The trainee's name is " + name); // concatenation
        System.out.println("In upper case: " + anotherName);
        String testName = new String("Conor"); // creates a new String in the heap
        // testName = name;
        if(name.equals(testName))
            System.out.println("This is Conor");

    }
}
