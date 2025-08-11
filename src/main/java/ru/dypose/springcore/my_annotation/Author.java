package ru.dypose.springcore.my_annotation;

public @interface Author {
    String name() default "dypose";
    int age() default 52;
}
