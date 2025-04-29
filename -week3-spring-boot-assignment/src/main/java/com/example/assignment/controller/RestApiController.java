
package com.example.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestApiController {

    @GetMapping("/api/assignment2")
    public Map<String, Object> assignment2() {
        Map<String, Object> info = new HashMap<>();
        info.put("name", "John Doe");
        info.put("assignment", "Assignment 2");
        info.put("status", "Completed");
        return info;
    }

    @GetMapping("/api/sum")
    public Map<String, Object> sumApi(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        Map<String, Object> result = new HashMap<>();
        result.put("sum", a + b + c);
        return result;
    }
}
