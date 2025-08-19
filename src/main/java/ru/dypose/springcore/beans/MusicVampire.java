package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;

public class MusicVampire extends AbstractMusic implements Music {
    @Value("${music.MusicVampire}")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicVampire that = (MusicVampire) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String sound() {
        return name;
    }
}
