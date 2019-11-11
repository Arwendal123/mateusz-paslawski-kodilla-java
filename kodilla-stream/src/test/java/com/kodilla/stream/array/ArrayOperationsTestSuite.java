package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {-2, -1, 0, 1, 2, 3, 4, 567};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(71.75, result, 0);
    }
}
