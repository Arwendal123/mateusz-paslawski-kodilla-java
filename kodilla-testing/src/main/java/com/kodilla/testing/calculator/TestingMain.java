package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        int addResult = calc.addAToB(3,4);

        if (addResult == 7){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int subtractResult = calc.subtractAFromB(3,4);

        if (subtractResult == -1){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}