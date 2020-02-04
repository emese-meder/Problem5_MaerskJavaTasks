package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCubeOfDigits {

    CubeOfDigits cubeOfDigits = new CubeOfDigits();

    @Test
    public void testForSingleDigit(){
        assertEquals(8, cubeOfDigits.getDigitsCubed(2));
    }

    @Test
    public void testForDoubleDigit(){
        assertEquals(8+27, cubeOfDigits.getDigitsCubed(23));
    }

    @Test
    public void testForLargeNumber(){
        assertEquals(8*3+27 +125*3 + 64*2, cubeOfDigits.getDigitsCubed(235552244));
    }

    @Test
    public void testIfNumberContainsZero(){
        assertEquals(8+27, cubeOfDigits.getDigitsCubed(203));
    }

    @Test
    public void testIfNumberIsNegativeThenItIgnoresMinusSign(){
        assertEquals( 8+27, cubeOfDigits.getDigitsCubed(-23));
    }
    
}

