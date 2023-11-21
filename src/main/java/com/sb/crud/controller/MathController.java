package com.sb.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class MathController {


    @GetMapping("/math")
    public String showMathPage() {
        return "math";
    }

    @GetMapping(value = "/vowels")
    public static String getVowels(@RequestParam String name, Model model) {


        List<Character> numbers = name.chars()
                .mapToObj(c -> (char) c)
                .filter(TaskController::isVowel)
                .collect(Collectors.toList());
        model.addAttribute("numbers", numbers);
        return "math";

    }

    private static boolean isVowel(char c) {

        String vowel = "AEIOUaeiou";
        return vowel.indexOf(c) != -1;
    }

    @GetMapping("/api/math/ask")
    public String getNumbers(@RequestParam String operation, @RequestParam int start, @RequestParam int end, Model model) {
        List<Integer> numbers = getNumbersList(operation, start, end);
        model.addAttribute("numbers", numbers);
        return "math";
    }

    private List<Integer> getNumbersList(String name, int start, int end) {
        return switch (name.toUpperCase()) {
            case "EVEN" -> printEvensBWRange(start, end);
            case "ODD" -> printOddsBWRange(start, end);
            case "PRIME" -> printPrimesBWRange(start, end);
            default -> null;
        };
    }


//    @GetMapping(value = "/ask/{name}/{number}")
//    public List<Integer> provideInput(@PathVariable String name, @PathVariable int number) {
//
//        if (name.equalsIgnoreCase("EVEN")) {
//            return printFirstNEvens(number);
//        }
//        if (name.equalsIgnoreCase("ODD")) {
//            return printFirstNOdds(number);
//        }
//        if (name.equalsIgnoreCase("PRIME")) {
//            return getFirstNPrimes(number);
//        }
//        return null;
//    }

//    @GetMapping("/api/math/ask")
//    public String showMathPage(@RequestParam String operation, @RequestParam int number, Model model) {
//        List<Integer> numbers = getNumbers(operation, number);
//        model.addAttribute("numbers", numbers);
//        return "math";
//    }
//
//    private List<Integer> getNumbers(String name, int number) {
//        if (name.equalsIgnoreCase("EVEN")) {
//            return printFirstNEvens(number);
//        }
//        if (name.equalsIgnoreCase("ODD")) {
//            return printFirstNOdds(number);
//        }
//        if (name.equalsIgnoreCase("PRIME")) {
//            return getFirstNPrimes(number);
//        }
//        return null;
//    }


    public List<Integer> printEvensBWRange(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(num -> num % 2 == 0)
                .boxed().collect(Collectors.toList());
    }

    public List<Integer> printOddsBWRange(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(MathController::isPrime)
                .boxed().collect(Collectors.toList());
    }

    public List<Integer> printPrimesBWRange(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(num -> num % 2 != 0)
                .boxed().collect(Collectors.toList());
    }


    private List<Integer> printFirstNEvens(int number) {

        return IntStream.iterate(0, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .limit(number)
                .boxed()
                .collect(Collectors.toList());
    }

    private List<Integer> printFirstNOdds(int number) {

        return IntStream.iterate(0, i -> i + 1)
                .filter(i -> i % 2 != 0)
                .limit(number)
                .boxed()
                .collect(Collectors.toList());
    }

    private List<Integer> getFirstNPrimes(int number) {
        return IntStream.iterate(0, i -> i + 1)
                .filter(MathController::isPrime)
                .limit(number)
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}

