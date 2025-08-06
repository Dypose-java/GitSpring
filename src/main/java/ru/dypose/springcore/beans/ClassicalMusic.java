package ru.dypose.springcore.beans;

public class ClassicalMusic implements Music {
    //фабричный метод
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    private void initMethod() {
        System.out.println("Вызывается укзанный init-method перед перед использованием бина");
    }

    private void destroyMethod() {
        System.out.println("Вызывается указанный destroy-method для корректного удаление бина");
    }

    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
