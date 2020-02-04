package com.spartaglobal.em.engineering50;

import java.util.Arrays;

public class CubeOfDigits {
    public int getDigitsCubed(int number){
        String numberAsString = Integer.toString(number);
        int cubedSum = 0;
        for (int i = 0; i<numberAsString.length(); i++ ){
            if (("-").equals(String.valueOf(numberAsString.charAt(i))) ){
                continue;
            }
            cubedSum = cubedSum + (int) Math.pow(Character.getNumericValue(numberAsString.charAt(i)), 3);
        }
        return cubedSum;
    }
}
