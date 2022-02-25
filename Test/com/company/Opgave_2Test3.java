package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave_2Test3 {

    @Test
    public void testReturnTheSmallestNumber() {

        Opgave_2 opgave2 = new Opgave_2();

        int smallest = opgave2.returnTheSmallestNumber(3 , 5 ,7);

        assertEquals(3 , smallest);

    }

    @Test
    public void testReturnTheSmallestNumber1() {

        Opgave_2 opgave2 = new Opgave_2();

        int smallest = opgave2.returnTheSmallestNumber(13 , 10 ,18);

        assertEquals(10 , smallest);

    }
    @Test
    public void testReturnTheSmallestNumber2() {

        Opgave_2 opgave2 = new Opgave_2();

        int smallest = opgave2.returnTheSmallestNumber(7 , 65 ,2);

        assertEquals(2 , smallest);

    }





}