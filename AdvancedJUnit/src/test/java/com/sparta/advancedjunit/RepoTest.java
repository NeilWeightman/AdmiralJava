package com.sparta.advancedjunit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Optional;

public class RepoTest {
    @BeforeAll
    public static void setUp(){
        SpartanRepository.addSpartan(new Spartan(1, "Natasha Reilly",
                "Java SDET", LocalDate.of(2022, 2, 21)));
        SpartanRepository.addSpartan(new Spartan(2, "Sajad Gulzar", "Java SDET",
                LocalDate.of(2022, 2, 22)));
    }

    @Nested
    @DisplayName("Just testing getCourse()")
    public class CheckCourse{
        @Test
        public void checkNatasha(){
            Assertions.assertTrue(SpartanRepository.findSpartan(1).get().getCourse().equals("Java SDET"));
        }
        @Test
        public void checkSajad(){
            Assertions.assertTrue(SpartanRepository.findSpartan(2).get().getCourse().equals("Java SDET"));
        }
    }
}
