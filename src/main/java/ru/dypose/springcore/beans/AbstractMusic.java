package ru.dypose.springcore.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public abstract class AbstractMusic {
    @PostConstruct
    public void postConstruct(){
        System.out.println(this.getClass().getSimpleName()+ " выполняюсь до инициализации");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println(this.getClass().getSimpleName()+ "  выполняюсь после инициализации");
    }
}
