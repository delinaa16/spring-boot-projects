
package com.example.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostRestController {

    @GetMapping("/list")
    public List<String> postList() {
        return Arrays.asList("Post A", "Post B", "Post C");
    }
}
