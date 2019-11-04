package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.StringModifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

        //7.1 Zadanie: Upiększacz tekstów
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "Jeden, dwa, TrZy, CZTERY, piec, szesc";

        System.out.println(poemBeautifier.beautify(text,StringModifier::affixesABC));
        System.out.println(poemBeautifier.beautify(text,(string) -> string.toUpperCase()));
        System.out.println(poemBeautifier.beautify(text,StringModifier::brackets));
        System.out.println(poemBeautifier.beautify(text,StringModifier::braces));

        //7.2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);




    }
}