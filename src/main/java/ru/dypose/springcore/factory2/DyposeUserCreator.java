package ru.dypose.springcore.factory2;

public class DyposeUserCreator extends CreatorUser{
    @Override
    protected User create() {
        return new DyposeUser();
    }
}
