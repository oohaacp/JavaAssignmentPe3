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
        public void ArithmeticException() { //Not asked in P.e 3


            //act
            String result = exception.ArithmeticException(3, 0);

            //assert
            assertEquals("Can't divide a number by 0", result);//checking expected and actual values
        }

        @Test
        public void NegativeArraySizeException() {
            String result = exception.NegativeArraySizeException(-8);
            assertEquals("Can't create array of negative size", result);//checking expected and actual values
        }


        @Test
        public void NullPointerException() {
            String result = exception.NullPointerException(0);
            assertEquals("NullPointerException..", result);//checking expected and actual values
        }

        @Test
        public void ArrayIndexOutOfBound() {
            String result = exception.ArrayIndexOutOfBound(9);
            assertEquals("Wrong index number, please enter correct number. ", result);//checking expected and actual values
        }

        @Test
        public void StringIndexOutOfBoundsException() {
            String result = exception.StringIndexOutOfBoundsException(5);
            assertEquals("Wrong character index number, please enter correct number. ", result);//checking expected and actual values
        }
    }

