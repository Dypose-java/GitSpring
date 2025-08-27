package ru.dypose.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/first")
public class FirstController {
    @GetMapping("/start1")
    public String start1() {
        return "first/start1";
    }

    @GetMapping("/start2")
    public String start2() {
        return "first/start2";

    }
}
