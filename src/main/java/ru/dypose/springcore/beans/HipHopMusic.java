package ru.dypose.springcore.beans;

public class HipHopMusic implements Music{
    //фабричный метод
    private HipHopMusic(){}
    public static HipHopMusic getHipHopMusic(){
        return new HipHopMusic();
    }

    private void initMethod(){
        System.out.println("Вызывается укзанный init-method перед перед использованием бина");
    }
    private void destroyMethod(){
        System.out.println("Вызывается указанный destroy-method для корректного удаление бина");
    }
    @Override
    public String getSong() {
        return "Хип хоп музыка";
    }
}
