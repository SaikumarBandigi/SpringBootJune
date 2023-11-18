package com.sb.crud.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/math")
public class MathController {


    private String optionSelected = "";

    @GetMapping("ask/{name}")
    public String askWhichMethodToCall(@PathVariable String name) {
        if (name.equalsIgnoreCase("even")) {
            optionSelected = "even";
            return "give a number to print first N Even Numbers in below api";
        }
        if (name.equalsIgnoreCase("ODD")) {
            optionSelected = "odd";
            return "give a number to print first N Odd Numbers in below api";
        }
        if (name.equalsIgnoreCase("PRIME")) {
            optionSelected = "prime";
            return "give a number to print first N Prime Numbers in below api";
        }
        return "please provide valid number";
    }


    @GetMapping("{number}")
    public List<Integer> provideInput(@PathVariable int number) {
        if (optionSelected.equalsIgnoreCase("EVEN")) {
            return printFirstNEvens(number);
        }
        if (optionSelected.equalsIgnoreCase("ODD")) {
            return printFirstNOdds(number);
        }
        if (optionSelected.equalsIgnoreCase("PRIME")) {
            return getFirstNPrimes(number);
        }
        return null;
    }

    private static List<Integer> printFirstNEvens(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("soryy..");
        }

        int count = 0;
        int i = 0;
        List<Integer> evens = new ArrayList<>();
        while (count < number) {
            if (isEvenMethod(i)) {
                evens.add(i);
                count++;
            }
            i++;
        }
        return evens;
    }

    private static boolean isEvenMethod(int count) {
        return (count & 1) == 0;
    }

    private static List<Integer> printFirstNOdds(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("soryy..");
        }

        int count = 0;
        int i = 0;
        List<Integer> odds = new ArrayList<>();
        while (count < number) {
            if (isOddMethod(i)) {
                odds.add(i);
                count++;
            }
            i++;
        }
        return odds;
    }

    private static boolean isOddMethod(int i) {
        return (i & 1) == 1;
    }

    public List<Integer> getFirstNPrimes(int number) {

        if (number < 1) {
            throw new IllegalArgumentException("The number should be greater than 0.");
        }

        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int i = 2;

        while (count < number) {
            if (isPrimeMethod(i)) {
                primes.add(i);
                count++;
            }
            i++;
        }

        return primes;
    }

    private static boolean isPrimeMethod(int num) {
        if (num < 1) {
            throw new IllegalArgumentException("The number should be greater than 0.");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
