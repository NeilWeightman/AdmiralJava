package com.sparta.oop;

public class RetailStore {
    public static void main(String[] args) {
        Customer jyoti = new Customer("Jyoti", "Suresh", 1234);
        System.out.println(jyoti);

        Customer sami = new Customer();
        sami.setFirstName("Sami");
        System.out.println(sami);
    }
}
