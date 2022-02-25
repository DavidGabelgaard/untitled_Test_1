package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave_1Test2 {

    @Test
    public void udskriv() {

        Opgave_1 opg_1 = new Opgave_1();

        String testString = opg_1.udskriv(50 , "ja");

        assertEquals("Godkendt 1" , testString);
    }
    @Test
    public void udskriv1() {

        Opgave_1 opg_1 = new Opgave_1();

        String testString = opg_1.udskriv(150 , "ja");

        assertEquals("Godkendt 2" , testString);
    }
    @Test
    public void udskriv2() {

        Opgave_1 opg_1 = new Opgave_1();

        String testString = opg_1.udskriv(50 , "nej");

        assertEquals("Godkendt 3" , testString);
    }
    @Test
    public void udskriv3() {

        Opgave_1 opg_1 = new Opgave_1();

        String testString = opg_1.udskriv(150 , "nej");

        assertEquals("Godkendt 4" , testString);


    }
    @Test
    public void udskriv4() {

        Opgave_1 opg_1 = new Opgave_1();

        String testString = opg_1.udskriv(100 , "nej");

        assertEquals("Godkendt" , testString);

    }








}