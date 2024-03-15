package com.careerit.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    @DisplayName("Adding Two Positive Number")
    void addTwoPositiveNumbers() {
        Calculator obj = new Calculator();
        int expected = 30;
        int actual = obj.add(10, 20);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Adding Two Negative Number")
    void addTwoNegativeNumbers() {
        Calculator obj = new Calculator();
        int expected = -30;
        int actual = obj.add(-10, -20);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Adding One Positive and One Negative Number")
    void addOnePositiveAndOneNegativeNumber() {
        Calculator obj = new Calculator();
        int expected = 10;
        int actual = obj.add(30, -20);
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void addWithParameters(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

}