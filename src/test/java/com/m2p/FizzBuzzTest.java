package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    FizzBuzz fizzBuzzNumber = new FizzBuzz();

    @Test
    void toReturnFizzIfSixIsGivenAsInput()
    {
        //Arrange
        String expectedString = "Fizz";

        //Act
        String actualString = fizzBuzzNumber.getFizzBuzz(6);

        //Assert
        assertEquals(expectedString,actualString);
    }

    @Test
    void toReturnBuzzIfTenIsGivenAsInput()
    {
        //Arrange
        String expectedString = "Buzz";

        //Act
        String actualString = fizzBuzzNumber.getFizzBuzz(10);

        //Assert
        assertEquals(expectedString,actualString);
    }

    @Test
    void toReturnTheSameNumberIfItIsNotDivisibleByBothThreeAndFive()
    {
        //Arrange
        String expectedResult = "11";

        //Act
        String actualResult = fizzBuzzNumber.getFizzBuzz(11);

        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void toReturnExceptionIfInputNumberIsNegativeOrGreaterThanHundred()
    {
        assertThrows(IllegalArgumentException.class,()-> fizzBuzzNumber.getFizzBuzz(0));
    }
}
