package ru.dypose.springcore.beans.new_annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
    @Value("${user.name}")
    private  String name;
    @Value("${user.age}")
    private  int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @PostConstruct
    private void getInitMethod(){
        System.out.println("prototype");
        System.out.println("Я запускаюсь после запуска спринги/контейнера/создание бина" +
                "/внедрение DI");
    }
    @PreDestroy
    private void getDestroyMethod(){
        System.out.println("prototype");
        System.out.println("Я запускаюсь после initMethod/Готовый бин к использованию");
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
