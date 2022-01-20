package com.sparta.test.test;

import com.sparta.test.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void testGetMessage(){
        String expected = "Welcome to Sparta, Tolu";
        Example ex = new Example();
        Assertions.assertEquals(expected, ex.getMessage("Tolu"));
    }
}
