package ru.dypose.springcore.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListIceFox {

    private List<IceFox> list = new ArrayList<>();

    @Autowired
    public void setIceFox(IceFox iceFox) {
        list.add(iceFox);
    }

    public boolean checkIceFox(IceFox iceFox) {
        return list.stream().anyMatch(el -> el.equals(iceFox));
    }

    public void printAllListIceFox() {
        list.stream().forEach(System.out::println);
    }
}
