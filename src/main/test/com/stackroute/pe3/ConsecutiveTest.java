package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class ConsecutiveTest {
    Consecutive consecutive = new Consecutive();
    String str = " ";

    @Before
    public void setUp() {
        //arrange
        consecutive = new Consecutive();
    }

    @After
    public void tearDown() {
        //arrange
        consecutive = null;
    }

    @Test
    public void givenInputStringShouldReturnTestConsecutiveNumbers() {

        String str = "10,11,12,13,14,15,16,17";
        assertEquals(
                "check in sequential order if is it consecutive or not",
                "consecutive", consecutive.getConsecutiveNumbers(str));//checking expected and actual values
    }

    @Test
    public void givenInputStringShouldReturnNonTestConsecutiveNumber() {
        String str = "10,20,30,40,50,60";
        assertEquals(
                "check is it non consecutive or not",
                "non consecutive", consecutive.getConsecutiveNumbers(str));//checking expected and actual values
    }

    @Test
    public void givenInputStringShouldReturnTestConsecutive() {
        String str = "11,10,9,8,7,6";
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "consecutive", consecutive.getReverseConsecutiveNumbers(str));//checking expected and actual values
    }
}
