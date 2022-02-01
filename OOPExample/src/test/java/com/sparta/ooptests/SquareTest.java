package com.sparta.ooptests;

import com.sparta.shapes.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void testCalcArea(){
        Square sq = new Square(12.0);
        double actual = sq.calcArea();
        double expected = 144.0;
        Assertions.assertEquals(expected, actual);
    }
}
