package ru.dypose.springcore.beans;

public class RockMusic implements Music{
    //фабричный метод
    private RockMusic(){}
    private RockMusic getRockMusic(){
        return new RockMusic();
    }
    private void initMethod(){
        System.out.println("Вызывается укзанный init-method перед перед использованием бина");
    }
    private void destroyMethod(){
        System.out.println("Вызывается указанный destroy-method для корректного удаление бина");
    }
    @Override
    public String getSong() {
        return "Рок музыка";
    }
}
