package ru.dypose.springcore.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "";
    int dateOfCreation()default 0;
    String purpose()default "";
}
