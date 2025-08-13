package ru.dypose.springcore.check;

import org.springframework.stereotype.Component;

@Component
public class OrangeIceFox implements IceFox{
    private String name;
    private String color;

    public OrangeIceFox() {
        this.name="Клубника";
        this.color="Оранж ";
    }
    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void getColor() {
        System.out.println(color);
    }

    @Override
    public String toString() {
        return "OrangeIceFox{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
