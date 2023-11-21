package com.sb.crud.controller;

import com.sb.crud.exhandle.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    @GetMapping("/{id}")
    public String getResourceById(@PathVariable Long id) {

        if (id == 1) {
            throw new ResourceNotFoundException("soryy..");
        }

        return id + "resource found";
    }
}
