package ru.dypose.springcore.generic.task4;

import ru.dypose.springcore.TestSpring;

import java.util.*;

public class MyComparable {
public static <T extends Comparable<T>> boolean isEquals(T first,T last){

    return first.compareTo(last) == 0;
}

    public static void main(String[] args) {
        boolean equals = MyComparable.isEquals(1, 1);


    }
}

class User {
    private String firstName,lastName;
    private int id;



    public User(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            list.add(new User("firstName","lastname",new Random().nextInt(50,100)));
        }

    }
}
