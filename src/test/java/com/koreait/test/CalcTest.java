package com.koreait.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    public void sum() {
        int n3 = 10;
        int n4 = 15;
        Calc calc = new Calc();

        assertEquals((n3+ n4), calc.sum(n3, n4));
    }

}