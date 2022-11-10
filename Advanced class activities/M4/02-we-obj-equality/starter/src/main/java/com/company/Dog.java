package com.company;

import java.util.Objects;

public class Dog {

    private int age;
    private String color;
    private String favToy;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFavToy() {
        return favToy;
    }

    public void setFavToy(String favToy) {
        this.favToy = favToy;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Dog dog = (Dog) object;
        return getAge() == dog.getAge()
                && java.util.Objects.equals(getColor(), dog.getColor())
                && java.util.Objects.equals(getFavToy(), dog.getFavToy());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getColor(), getAge(), getFavToy());
    }
}
