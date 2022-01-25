package com.sparta.basics;

public class SomeExamples {
    public static void main(String[] args) {
        int a = 3;
        int b = 19;
        System.out.println(b/a);
        boolean isBig = b > 12;
        if(a>5)
            System.out.println("b is big");
        Customer o = new Customer();
        o = null;
        if(o == null)
            System.out.println("o is null");
        System.out.println(o.getAge());
    }
}
