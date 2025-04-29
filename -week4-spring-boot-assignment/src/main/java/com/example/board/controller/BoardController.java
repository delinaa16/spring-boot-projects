
package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public String boardList(Model model) {
        List<String> boards = Arrays.asList("Board 1", "Board 2", "Board 3");
        model.addAttribute("boards", boards);
        return "boardList";
    }
}
