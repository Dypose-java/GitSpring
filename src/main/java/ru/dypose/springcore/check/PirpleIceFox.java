package ru.dypose.springcore.check;

public class PirpleIceFox implements IceFox{
    private String name;
    private String color;

    public PirpleIceFox() {
        this.name="Черная Малина Айс";
        this.color="Фиолетовый";
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void getColor() {
        System.out.println(color);
    }


}
