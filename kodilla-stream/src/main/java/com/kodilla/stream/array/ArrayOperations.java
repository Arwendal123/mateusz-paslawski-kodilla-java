package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        if(numbers.length != 0) {
            return IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average().orElse(0);
        }else{
            return 0.0;
        }
    }
}
