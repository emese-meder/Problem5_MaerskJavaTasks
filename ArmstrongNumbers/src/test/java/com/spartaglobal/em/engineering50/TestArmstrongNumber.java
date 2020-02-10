package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestArmstrongNumber {
    ArmstrongNumber armstrongNumber = new ArmstrongNumber();

    @Test
    public void tesItReturnsTrueFor153(){
        assertTrue(armstrongNumber.isArmstrongNumber(153));
    }

    @Test
    public void tesItReturnsFalseFor22(){
        assertFalse(armstrongNumber.isArmstrongNumber(22));
    }

    @Test
    public void tesItReturnsTrueForZero(){
        assertTrue(armstrongNumber.isArmstrongNumber(0));
    }

    @Test
    public void tesItReturnsFalseForNegativeNumber(){
        assertFalse(armstrongNumber.isArmstrongNumber(-153));
    }

    @Test
    public void tesItReturnsFalseForSingleDigit(){
        assertFalse(armstrongNumber.isArmstrongNumber(8));
    }

}
