package com.company;

import org.junit.Assert;
import org.junit.Test;

public class Opgave_1Test {

    @Test
    public void fTest() {
        Opgave_1 opg_1 = new Opgave_1();
        int i = opg_1.f(12);
        Assert.assertEquals(3 , i);

    }
    @Test
    public void fTest1() {
        Opgave_1 opg_1 = new Opgave_1();
        int i = opg_1.f(5);
        Assert.assertEquals(1 , i);

    }

    @Test
    public void fTest2() {
        Opgave_1 opg_1 = new Opgave_1();
        int i = opg_1.f(17);
        Assert.assertEquals(4 , i);

    }
    @Test
    public void fTest3() {
        Opgave_1 opg_1 = new Opgave_1();
        int i = opg_1.f(8);
        Assert.assertEquals(2 , i);

    }

}