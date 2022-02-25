package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave_2Test4 {

    @Test
    public void testReturnTheLargestNumber() {

        Opgave_2 opgave2 = new Opgave_2();

        int largest = opgave2.returnTheLargestNumber(3 , 5 ,7);

        assertEquals(7 , largest);

    }
    @Test
    public void testReturnTheLargestNumber1() {

        Opgave_2 opgave2 = new Opgave_2();

        int largest = opgave2.returnTheLargestNumber(13 , 5 ,7);

        assertEquals(13 , largest);

    }
    @Test
    public void testReturnTheLargestNumber2() {

        Opgave_2 opgave2 = new Opgave_2();

        int largest = opgave2.returnTheLargestNumber(64 , 150 ,120);

        assertEquals(150 , largest);

    }



}