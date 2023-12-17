package com.sb.crud.controller;

import com.sb.crud.service.BinarySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @GetMapping("/giveAnArray/{arr}/{target}")
    public int getIndex(@PathVariable int[] arr, @PathVariable int target) {
        System.out.println("yo angular..");
        return BinarySearchService.binarySearch(arr, target);
    }


    @GetMapping(value = "/{name}")
    public List<Character> getVowels(@PathVariable String name) {

        if (name == null) {
            // Handle null case, you can return an empty list or throw an exception
            return Collections.emptyList();
        }

        return name.chars()
                .mapToObj(c -> (char) c)
                .filter(TaskController::isVowel)
                .collect(Collectors.toList());
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }


}
