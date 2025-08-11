package ru.dypose.springcore.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//ru.dypose.springcore.reflection.User java.lang.String setName
        Scanner scanner = new Scanner(System.in);
        //получаем классы
        Class<?> aClass1 = Class.forName(scanner.next());
        Class<?> aClass2 = Class.forName(scanner.next());

        //получаем имя метода
        String nameMethod = scanner.next();
        //метод
        Method method = aClass1.getMethod(nameMethod,aClass2);
        //создаем обьект с пустым конструктором
        Object aClass1Const = aClass1.newInstance();
        //создаем констурктор стринг с параметром
        Object aClass2Const = aClass2.getConstructor(String.class).newInstance("Dypose");
        //вызываем метод
        method.invoke(aClass1Const,aClass2Const);
        System.out.println(aClass1Const);


    }
}
