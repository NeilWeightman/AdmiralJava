package com.sparta.exceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Cat {
    public String meow(String name) throws CatException{
        try {
            name = name.toUpperCase();
        } catch(NullPointerException e) {
            CatDriver.logger.warn("Problem!");
            throw new CatException("Cat exception occurred!", e);
        } finally {
            if(name == null)
                name = "dummy value";
        }
        return name + " Meow";
    }
    public Date convertToDate(String s) {
        Date result=null;
        try {
            result = new SimpleDateFormat().parse(s);
        } catch(NullPointerException|ParseException e){
            e.printStackTrace();
        } finally {
            System.out.println("This is always executed");
        }
        return result;
    }
}
