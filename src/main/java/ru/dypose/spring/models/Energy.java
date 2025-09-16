package ru.dypose.spring.models;

import java.util.Objects;

public class Energy {
    private int id;
    private String name;
    private String taste;

    public Energy(int id, String name, String taste) {
        this.id = id;
        this.name = name;
        this.taste = taste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Energy energy = (Energy) object;
        return Objects.equals(name, energy.name) && Objects.equals(taste, energy.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taste);
    }

    @Override
    public String toString() {
        return "Energy{" + "name='" + name + '\'' + ", taste='" + taste + '\'' + '}';
    }
}
