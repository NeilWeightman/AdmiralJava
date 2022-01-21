package com.spartaglobal.configtest;

public class ConfigTester {
    private String name;
    public static void main(String[] args) {
        ConfigTester ct = new ConfigTester();
        System.out.println(ct.getMessage("Mihai"));
    }
    public String getMessage(String name){
        return "Welcome to Sparta, " + name + "!";
    }
    public String getName(){
        return name;
    }
}
