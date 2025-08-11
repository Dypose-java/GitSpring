package ru.dypose.springcore.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@MethodInfo(author = "Dypose",dateOfCreation = 2025,purpose = "print")
public class Test {
    private static String string;
    public static void main(String[] args) {
        AnnotationChecker.getDeclareFields(Test.class);
    }

}
class AnnotationChecker{
public static <T> boolean isAnnotationMethodInfo(Class<T> tClass){
    if (tClass==null)return false;
    return tClass.isAnnotationPresent(MethodInfo.class);
}
    public static <T> void getDeclareFields(Class<T>tClass){
        List<Field> list = Arrays.stream(tClass.getDeclaredFields()).toList();
        if (list.isEmpty()){
            System.out.println(tClass.getName()+" declareFields is not");
            return;
        }
        System.out.println(list);
    }
}

