package ru.dypose.springcore.generic.task1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HelperArray {
    public static<T> void printArray(T[] array){
        String collect = Arrays.stream(array).map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5};
        HelperArray.printArray(arr);
    }
}
