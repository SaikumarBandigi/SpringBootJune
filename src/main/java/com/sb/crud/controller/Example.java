package com.sb.crud.controller;


import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        System.out.println(getVowels("sai"));
    }

    public static List<Character> getVowels(String name) {

        return name.chars()
                .mapToObj(c -> (char) c)
                .filter(TaskController::isVowel)
                .collect(Collectors.toList());
    }

    private static boolean isVowel(char c) {

        String vowel = "AEIOUaeiou";
        return vowel.indexOf(c) != -1;
    }

}
