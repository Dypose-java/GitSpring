package ru.dypose.springcore.factory2;

public class InteggaUserCreator extends CreatorUser {
    @Override
    protected User create() {
        return new InteggaUser();
    }
}
