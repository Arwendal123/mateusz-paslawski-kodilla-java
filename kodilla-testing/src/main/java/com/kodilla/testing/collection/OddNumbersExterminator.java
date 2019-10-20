package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i : numbers) {
            if (i % 2 == 0) evenNumbers.add(i);
        }
        return evenNumbers;
    }
}
