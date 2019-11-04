package com.kodilla.stream.beautifier;

public class StringModifier {

    private static String modify(String text, String prefix, String suffix){
        return prefix + text + suffix;
    }
    public static String affixesABC(String text){
        return modify(text, "ABC", "ABC");
    }
    public static String brackets(String text){
        return modify(text, "(", ")");
    }
    public static String braces(String text) {
        return modify(text, "{", "}");
    }


}
