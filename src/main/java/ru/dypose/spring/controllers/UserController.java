package ru.dypose.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dypose.spring.model.DataUser;
import ru.dypose.spring.model.User;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    private final DataUser dataUser;

    public UserController(DataUser dataUser) {
        this.dataUser = dataUser;
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam(name = "name", required = false) String name,
                             @RequestParam(name = "age", required = false) Integer age,
                             Model model) {

        model.addAttribute("searchName", name);
        model.addAttribute("searchAge", age);

        // Проверяем, что хотя бы один параметр передан
        if (name != null || age != null) {
            var user = dataUser.getUsersByNameAndAge(name, age);

            if (user.isPresent()) {
                var getUser = user.get();
                model.addAttribute("searchResult", getUser);
            } else {
                model.addAttribute("notFound", true);
            }
        }

        model.addAttribute("title", "Поиск пользователя");
        return "users/search-user";
    }
}
