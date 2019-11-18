package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            System.out.println(secondChallenge.probablyIWillThrowException(3, 0));
            System.out.println(secondChallenge.probablyIWillThrowException(1.1, 0));
        } catch (Exception e) {
            System.out.println("You messed up!");
        } finally {
            System.out.println("Well... fine.");
        }
    }
}
