package ru.dypose.springcore.factory2;

public class Test {
    public static void main(String[] args) {
        CreatorUser creatorUser = new DyposeUserCreator();
        User user=creatorUser.create();
        boolean b =creatorUser.getClass().isInstance(user);
        System.out.println(b);
    }
}
