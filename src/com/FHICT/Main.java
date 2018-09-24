package com.FHICT;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte bit = 0;

        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);
            //bit ^= 1;
            int x = 2%i;
            bit =Byte.parseByte(Integer.toString(x));
        }
    }

}






