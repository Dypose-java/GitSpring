package ru.dypose.springcore.inversionOfControl;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Рок музыка";
    }
}
