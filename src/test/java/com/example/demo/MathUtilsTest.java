package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathUtilsTest
{
    @Test
    void testAdd(){
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
       assertEquals(expected,actual);

    }

    @Test
    void testComputeCircleRadius(){
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"return the right circle area");
    }


}
