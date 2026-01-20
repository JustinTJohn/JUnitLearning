package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator;

    @BeforeEach
    void setUp(){
        simpleCalculator = new SimpleCalculator();
    }

    //Happy path

    @Test
    void add_whenTwoPositiveNumbers_thenReturnsSum(){
        assertEquals(3, simpleCalculator.add(1, 2));
    }

    @Test
    void subtract_whenValidNumbers_thenReturnsDifference(){
        assertEquals(1, simpleCalculator.subtract(3, 2));
    }

    @Test
    void divide_whenTwoValidNumbers_thenReturnsQuotient(){
        assertEquals(5, simpleCalculator.divide(10, 2));
    }

    //Edge case
    @Test
    void add_whenAddingByZero_returnsTheSameNumber(){
        assertEquals(7, simpleCalculator.add(7, 0));
    }


    //Exception
    @Test
    void divide_whenDividingByZero_throwsException(){
        assertThrows(IllegalArgumentException.class, () -> {
            simpleCalculator.divide(2, 0);
        });
    }
}