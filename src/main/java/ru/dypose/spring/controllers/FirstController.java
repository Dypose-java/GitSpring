package ru.dypose.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/first")
public class FirstController {
    @GetMapping("/start1")
    public String start1(@RequestParam(name = "name",defaultValue = "defaultName")String name,
                         @RequestParam(name = "lastName",defaultValue = "defaultLastName")String lastName) {
        //пример работы с параметрами
        System.out.println(String.format("Name:%s,lastName:%s",name,lastName));
        return "first/start1";
    }

    @GetMapping("/start2")
    public String start2() {
        return "first/start2";

    }
}
