package com.careerit.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTests {


        @Test
        @DisplayName("Biggest of 10,20,30 is 30")
        void biggestWithSameNumbers() {
            MathUtil obj = new MathUtil();
            int expected = 10;
            int actual = obj.biggest(10, 10, 10);
            assertEquals(expected, actual);
        }


        @ParameterizedTest(name = "Biggest of {0},{1},{2} is {3}")
        @CsvSource({
            "10,20,30,30",
            "20,10,30,30",
            "20,30,10,30",
            "30,20,10,30",
            "30,10,20,30",
            "10,30,20,30"
        })
        void biggestWithDifferentNumbers(int a, int b, int c, int expected) {
            MathUtil obj = new MathUtil();
            int actual = obj.biggest(a, b, c);
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Biggest element in given array")
        void biggestElementInArray(){
            MathUtil obj = new MathUtil();
            int[] arr = {10,20,30,40,50,25,15,45};
            int expected = 50;
            int actual = obj.biggest(arr);
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Biggest element in given array with negative numbers")
        void biggestElementInArrayWithNegativeNumbers(){
            MathUtil obj = new MathUtil();
            int[] arr = {-10,-20,-30,-40,-50};
            int expected = -10;
            int actual = obj.biggest(arr);
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("With empty array")
        void biggestElementInEmptyArray(){
            MathUtil obj = new MathUtil();
            int[] arr = {};
            assertThrows(IllegalArgumentException.class,()->obj.biggest(arr));
        }

        @Test
        @DisplayName("Check for palindrome; with palindrome number")
        void isPalindromeWithPalindromeNumber(){
            MathUtil obj = new MathUtil();
            int num = 12321;
            boolean actual = obj.palindrome(num);
            assertTrue(actual);
        }
        @Test
        @DisplayName("Check for palindrome; with non palindrome number")
        void isPalindromeWithNonPalindromeNumber(){
            MathUtil obj = new MathUtil();
            int num = 12345;
            boolean actual = obj.palindrome(num);
            assertFalse(actual);
        }
}
