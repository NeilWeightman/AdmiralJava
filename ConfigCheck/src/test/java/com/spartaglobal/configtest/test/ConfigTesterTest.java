package com.spartaglobal.configtest.test;

import com.spartaglobal.configtest.ConfigTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConfigTesterTest {
    @Test
    public void testGetMessage(){
        ConfigTester ct = new ConfigTester();
        String actual = ct.getMessage("Autumn");
        String expected = "Welcome to Sparta, Autumn!";
        Assertions.assertEquals(expected, actual);
    }
}
