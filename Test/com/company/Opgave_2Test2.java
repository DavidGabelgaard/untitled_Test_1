package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave_2Test2 {

    @Test
    public void testReturnTheLargestNumber() {


        Opgave_2 opgave2 = new Opgave_2();

        int largest = opgave2.returnTheLargestNumber(1 ,2);

        assertEquals(2 , largest);

    }
    @Test
    public void testReturnTheLargestNumber2() {


        Opgave_2 opgave2 = new Opgave_2();

        int largest = opgave2.returnTheLargestNumber(13 ,10);

        assertEquals(13 , largest);

    }
}