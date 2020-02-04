package com.spartaglobal.em.engineering50;

public class CubeOfDigits {
    public int[] getDigitsCubed(int number){
        String numberAsString = Integer.toString(number);
        int[] cubedDigits = new int[numberAsString.length()];
        for (int i = 0; i<numberAsString.length(); i++ ){
            System.out.println(numberAsString.charAt(i));
            cubedDigits[i] = (int) Math.pow(Character.getNumericValue(numberAsString.charAt(i)), 3);
        }
        return cubedDigits;
    }
}
