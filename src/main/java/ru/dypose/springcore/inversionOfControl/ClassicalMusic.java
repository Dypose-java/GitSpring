package ru.dypose.springcore.inversionOfControl;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
