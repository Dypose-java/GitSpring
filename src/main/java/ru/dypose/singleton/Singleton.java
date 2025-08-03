package ru.dypose.singleton;

public class Singleton {
   private static Singleton instance;
private String name;
    private Singleton(String name) {
        this.name=name;
    }
    public static Singleton getInstance(String name){
        if (instance==null) instance=new Singleton(name);
        return instance;
    }

    public String getName() {
        return name;
    }

}

class Test {
    public static void main(String[] args) {
        Singleton singleton =Singleton.getInstance("first");
        Singleton singleton1 =Singleton.getInstance("last");
        System.out.println(singleton1==singleton);
        System.out.println(singleton.getName()+"\n"+singleton1.getName());
    }
}
