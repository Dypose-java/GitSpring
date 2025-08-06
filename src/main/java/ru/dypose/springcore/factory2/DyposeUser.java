package ru.dypose.springcore.factory2;

public class DyposeUser implements User {
    private String name;

    @Override
    public void getUser() {
        System.out.println(this.name);
    }

    @Override
    public void setUser(String name) {
        this.name = name;
    }
}
