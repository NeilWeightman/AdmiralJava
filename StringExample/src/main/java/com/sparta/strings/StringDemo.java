package com.sparta.strings;

import java.util.List;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Harry Lewis"; // normal approach, works because Strings are immutable
        // String name = new String("Harry Lewis");
        System.out.println(name.contains("Harry"));
        String formatted = String.format("The trainee's name is %s %3d", name, 25);
        System.out.println(formatted);
        List l = List.of("Harry", "Mihai", "Monali");
        String result = String.join(", ", l);
        System.out.println(result);
        String postcode = "SE15 2PH";
        System.out.println(postcode.matches("^[a-zA-Z]{1,2}[0-9][0-9A-Za-z]{0,1} {0,1}[0-9][A-Za-z]{2}$"));
        String names = "Harry; Mihai, Monali";
        String[] namesArray = names.split("[,;] ");
        for(String n:namesArray){
            System.out.println(n);
        }
        int startindex = names.indexOf(';')+2;
        int endIndex = names.indexOf(',');
        System.out.println(names.substring(startindex, endIndex));
    }
}
