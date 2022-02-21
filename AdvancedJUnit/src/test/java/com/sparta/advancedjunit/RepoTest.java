package com.sparta.advancedjunit;

import org.junit.jupiter.api.*;
import org.mockito.InOrder;
import org.mockito.Mockito;

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

    @Test
    public void mockingTheSpartan(){
        Spartan spartan = Mockito.mock(Spartan.class);
        Mockito.when(spartan.getId()).thenReturn(3);
        Mockito.when(spartan.getName()).thenReturn("Test Name");
        Mockito.when(spartan.getCourse()).thenReturn("Test Course");
        Mockito.when(spartan.toString()).thenReturn("The mock object");
        SpartanRepository.addSpartan(spartan);
        System.out.println(SpartanRepository.getAllSpartans());
        if(SpartanRepository.findSpartan(3).isPresent())
            Assertions.assertEquals("Test Name", SpartanRepository.findSpartan(3).get().getName());
    }

    @Test
    public void repeatedCalls(){
        Spartan mockSpartan = Mockito.mock(Spartan.class);
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.of(2022, 2, 20));
        System.out.println(mockSpartan.getStartDate());
        System.out.println(mockSpartan.getStartDate());
    }

    @Test
    public void mockSpying(){
        Spartan spartan = new Spartan(111, "Aiden Sykes", "Java SDET", LocalDate.now());
        Spartan spyAiden = Mockito.spy(spartan);
        System.out.println(spartan);
        Mockito.when(spyAiden.getName()).thenReturn("Mock Name");
        System.out.println(spyAiden.getCourse());

        System.out.println(spyAiden.getName());
        Mockito.verify(spyAiden, Mockito.atLeastOnce()).getName();

        InOrder order = Mockito.inOrder(spyAiden);
        order.verify(spyAiden).getName();
        order.verify(spyAiden).getCourse();

    }


}
