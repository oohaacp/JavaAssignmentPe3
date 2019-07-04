package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class StringArrayTest
{

        StringArray stringArray;

        @Before
        public void setUp() {
            //arrange
            stringArray = new StringArray();
        }

        @After
        public void tearDown() {
            //arrange
            stringArray= null;
        }
        @Test

        public  void givenInputStringShouldReturnCompareTest()
        {
            String[] str1={"8","A","39"};
            String[] str2={"8","B","39"};
            String str="not equal";
            assertEquals(str,stringArray.compareString(str1,str2));//checking expected and actual values

        }
        @Test
        public void givenInputStringShouldReturnDuplicateRemove()
        {
            String[] str1={"10","20","10","30"};
            String str="duplicates found";
            assertEquals(str,stringArray.removeDuplicateElements(str1));//checking expected and actual values
        }
        @Test
        public void givenInputStringShouldReturnAppendString()
        {
            String[] str1={"10","20","30"};
            String[] str2={"50","20","40"};
            String[] str={"10","20","30","50"};
            assertArrayEquals(str,stringArray.isAppen(str1,str2));//checking expected and actual values
        }

        @Test
        public void givenInputStringShouldReturnPrependMid()
        {
            String[] str1={"10","20","30"};
            String[] str2={"50","60","70"};
            String[] str={"60","10","20","30"};
            assertArrayEquals(str,stringArray.isPrepen(str1,str2));//checking expected and actual values
        }
    }


