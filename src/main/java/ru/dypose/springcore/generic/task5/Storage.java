package ru.dypose.springcore.generic.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Storage<T extends Number> {
    private List<T> listStorage = new ArrayList<>();

    public void add(T... item){
        for (T el:item){
            listStorage.add(el);
        }
    }

    public double sum(){
      return listStorage.stream().mapToDouble(Number::doubleValue).sum();
    }
    public double sumUnique(){
        return listStorage.stream().distinct().mapToDouble(Number::doubleValue).sum();
    }

    public static void main(String[] args) {
       /*List<Integer> list = IntStream.rangeClosed(0,10).boxed().toList();
       list.stream().filter(integer -> integer%2==0).forEach(System.out::println);
       list.stream().map(String::valueOf).map(String::length).forEach(System.out::println);*/
       List<List<Integer>> lists =List.of(List.of(1,2,3),List.of(4,5,6));
       lists.stream().flatMap(Collection::stream).forEach(System.out::println);
       //lists.stream().map
    }
}
