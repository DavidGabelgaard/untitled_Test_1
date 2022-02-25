package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Opgave_2Test5 {

    @Test
    public void testReturnTheSmallestNumber() {

        Opgave_2 opgave2 = new Opgave_2();

        ArrayList<Integer> test = new ArrayList<>();

        test.add(56);
        test.add(13);
        test.add(8);
        test.add(15);
        test.add(75);

        int smallets =  opgave2.returnTheSmallestNumber(test);

        assertEquals(8 , smallets);

    }
}