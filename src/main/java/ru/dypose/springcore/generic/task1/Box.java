package ru.dypose.springcore.generic.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box<T> {
    private List<T> list = new ArrayList<>();
    public void setValue(T el){
        list.add(el);
    }
    public T getValue(int index){
        return list.get(index);
    }
    public boolean isEmpty(){
        if (list.isEmpty()) return true;
        return false;
    }


}
