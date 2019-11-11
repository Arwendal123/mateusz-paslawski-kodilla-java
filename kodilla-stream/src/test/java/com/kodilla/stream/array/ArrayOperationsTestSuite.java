package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(0, result, 0);
    }
}
