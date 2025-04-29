
package com.example.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/assignment1")
    public String assignment1(Model model) {
        model.addAttribute("message", "This is Assignment 1 Page");
        return "assignment1";
    }

    @GetMapping("/sumPage")
    public String sumPage(Model model, int a, int b, int c) {
        int sum = a + b + c;
        model.addAttribute("sum", sum);
        return "sumPage";
    }
}
