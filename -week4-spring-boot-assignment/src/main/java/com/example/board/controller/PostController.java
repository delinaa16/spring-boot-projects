
package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/post")
public class PostController {

    @GetMapping("/list")
    public String postList(Model model) {
        List<String> posts = Arrays.asList("Post A", "Post B", "Post C");
        model.addAttribute("posts", posts);
        return "postList";
    }
}
