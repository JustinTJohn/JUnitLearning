package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    Validator validator;

    @BeforeEach
    void setUp(){
        validator = new Validator();
    }

    @Test
    void validateAge_whenAbove18_thenReturnTrue(){
        assertEquals(true, validator.validateAge(19));
    }

    @Test
    void validateAge_whenBelow18_thenReturnFalse(){
        assertEquals(false, validator.validateAge(15));
    }

    @Test
    void validateAge_whenNegativeAge_thenThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateAge(-1);
        });
    }

}