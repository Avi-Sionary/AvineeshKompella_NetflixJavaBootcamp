package com.company;

public class Breeder {

    public Dog breedDogs(Dog dog1, Dog dog2) {
        Dog dog3 = new Dog();
        dog3.setAge(0);
        dog3.setColor(dog1.getColor() + dog2.getColor());
        dog3.setFavToy(dog1.getFavToy());
        return dog3;
    }

}
