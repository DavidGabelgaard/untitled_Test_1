package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave_2Test {

    @Test
    public void testReturnTheSmallestNumber() {

        Opgave_2 opgave2 = new Opgave_2();

        int smallest = opgave2.returnTheSmallestNumber(1 ,2);

        assertEquals(1 , smallest);

    }
    @Test
    public void testReturnTheSmallestNumber1() {

        Opgave_2 opgave2 = new Opgave_2();

        int smallest = opgave2.returnTheSmallestNumber(7 ,3);

        assertEquals(3 , smallest);

    }


}