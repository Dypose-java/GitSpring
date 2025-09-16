package ru.dypose.spring.dao;

import org.springframework.stereotype.Component;
import ru.dypose.spring.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class PersonDAO {
    private List<Person> peopleBD;

    {
        List<Character> alphabet = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        peopleBD = new ArrayList<>();
        for (int i = 0; i < 19; i++) {
            peopleBD.add(new Person(
                    i, "User:"+alphabet.toString()
                    .replace(",", "").replace(" ","").replace("[","")
                    .substring(0, new Random().nextInt(alphabet.size()))));
        }
        System.out.println(peopleBD);
    }

    public List<Person> index() {
        return peopleBD;
    }

    public Person show(int id) {
        return peopleBD.stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Пользователь с id:%s не найден", id)));
    }
}
