package ru.dypose.springcore.factory2;

public abstract class CreatorUser {
    protected abstract User create();

    public void application() {
        User user = create();
        user.setUser("name");
        user.getUser();
    }
}
