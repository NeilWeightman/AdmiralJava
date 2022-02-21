package com.sparta.advancedjunit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTest {
    private static Spartan testSpartan;
    @BeforeAll
    public static void setUp(){
        testSpartan = new Spartan(3, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
    }

    @Test
    //@Disabled("No spartan is available yet")
    @EnabledIf("checkSpartanCreated")
    public void checkName(){
        Assumptions.assumeTrue(testSpartan != null);
        Assertions.assertTrue(testSpartan.getName().equals("Brandon Johnson"));
    }

    private boolean checkSpartanCreated(){
        return testSpartan == null;
    }

    @ParameterizedTest
    @ValueSource(ints={1,2,3,5})
    public void paramTest(int number){
        Assertions.assertTrue(number < 4);
    }
    @ParameterizedTest
    @CsvSource(value={"Conor","Porteous"})
    public void csvTest(String name){
        Assertions.assertTrue(name.equals("Conor"));
    }

    @ParameterizedTest
    @MethodSource("generateSpartans")
    public void checkSpartans(Spartan spartan, int num){
        Assertions.assertTrue(num == spartan.getId());
        Assertions.assertTrue(spartan.getCourse().equals("Java SDET"));
    }

    private static Stream<Arguments> generateSpartans() {
        return Stream.of(
                Arguments.arguments(new Spartan(1, "test", "Java SDET",
                        LocalDate.of(2022,2,21)), 1),
                Arguments.arguments(new Spartan(2, "test2", "Java SDET",
                        LocalDate.of(2022,2,21)), 2),
                Arguments.arguments(new Spartan(3, "test3", "Java SDET",
                        LocalDate.of(2022,2,21)), 3),
                Arguments.arguments(new Spartan(4, "test4", "Java Dev",
                        LocalDate.of(2022,2,21)), 4)
                );
    }
}
