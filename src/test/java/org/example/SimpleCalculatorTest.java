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

    @Test
    void onePlusTwoEqualsThree(){
        assertEquals(3, simpleCalculator.add(1, 2));
    }

    @Test
    void twoPlusThreeEqualsFive(){
        assertEquals(5, simpleCalculator.add(2, 3));
    }
}