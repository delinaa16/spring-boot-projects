
package com.example.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/board")
public class BoardRestController {

    @GetMapping("/list")
    public List<String> boardList() {
        return Arrays.asList("Board 1", "Board 2", "Board 3");
    }
}
