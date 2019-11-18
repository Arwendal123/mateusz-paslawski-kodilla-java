package com.kodilla.exception.test;

public class FirstChallenge {

    private double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Dzielenie przez 0!");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try{
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Na pewno?" +e);
        }finally{
            System.out.println("Dzielenie zakończono.");
        }



    }
}