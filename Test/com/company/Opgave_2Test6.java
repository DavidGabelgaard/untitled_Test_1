package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Opgave_2Test6 {

    @Test
    public void returnTheLargestNumber() {

        Opgave_2 opgave2 = new Opgave_2();

        ArrayList<Integer> test = new ArrayList<>();

        test.add(56);
        test.add(13);
        test.add(8);
        test.add(15);
        test.add(75);
        test.add(-175);


        int largest = opgave2.returnTheLargestNumber(test);

        assertEquals(75 ,largest );





    }
}