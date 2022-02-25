package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Opgave_2Test8 {

    @Test
    public void returnAverage() {

        Opgave_2 opgave2 = new Opgave_2();

        ArrayList<Integer> test = new ArrayList<>();

        test.add(56);
        test.add(13);
        test.add(8);
        test.add(15);
        test.add(75);

         double average = opgave2.returnAverage(test);

        assertEquals(33.4 , average , 0.00000000000000000001 );





    }
}