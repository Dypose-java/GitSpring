package ru.dypose.spring.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
@Component
public class DataUser {
    private List<User> userList = new ArrayList<>();

    public DataUser() {
        for (int i = 1; i <20; i++) {
            userList.add(new User("userName" + i,i+5));
        }

    }
    public List<User> getUserList(){
        return userList;
    }

    public Optional<User> getUserByName(String name) {
        return userList.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }


    public List<User> getUsersByAge(int age) {
        return userList.stream()
                .filter(user -> user.getAge() == age)
                .toList();
    }

    public Optional<User> getUsersByNameAndAge(String name, Integer age) {
        return userList.stream()
                .filter(user -> {
                    boolean matches = true;
                    if (name != null) {
                        matches = matches && user.getName().equals(name);
                    }
                    if (age != null) {
                        matches = matches && user.getAge() == age;
                    }
                    return matches;
                })
                .findFirst();
    }
}
