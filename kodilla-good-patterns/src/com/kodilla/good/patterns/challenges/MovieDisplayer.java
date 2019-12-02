package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieDisplayer {
    public static void main(String[] args) {
        new MovieDisplayer().printAll(new MovieStore());
    }

    public void printAll(MovieStore movieStore) {
        if (movieStore == null) {
            throw new IllegalArgumentException("MovieStore is null");
        }
        String displayer = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(displayer);
    }
}
