package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest
{

        Exception exception;


        @Before
        public void setUp() {
            //arrange
            exception = new Exception();
        }

        @After
        public void tearDown() {
            //arrange
            exception = null;
        }

        @Test
        public void arithmeticException() { //Not asked in P.e 3


            //act
            String result = exception.ArithmeticException(3, 0);

            //assert
            assertEquals("Can't divide a number by 0", result);//checking Arithmetic Exception//
        }

        @Test
        public void givenInputStringShouldReturnNegativeArraySizeException() {
            String result = exception.NegativeArraySizeException(-8);
            assertEquals("Can't create array of negative size", result);//checking Negative Exception//
        }


        @Test
        public void givenInputStringShouldReturnNullPointerException() {
            String result = exception.NullPointerException(0);
            assertEquals("NullPointerException..", result);//checking Null pointer Exception
        }

        @Test
        public void givenInputStringShouldReturnArrayIndexOutOfBound() {
            String result = exception.ArrayIndexOutOfBound(9);
            assertEquals("Wrong index number, please enter correct number. ", result);//checking array index out of bound exception//
        }

        @Test
        public void givenInputStringShouldReturnStringIndexOutOfBoundsException() {//checking string index out of bound exception//
            String result = exception.StringIndexOutOfBoundsException(5);
            assertEquals("Wrong character index number, please enter correct number. ", result);//checking expected and actual values
        }
    }

