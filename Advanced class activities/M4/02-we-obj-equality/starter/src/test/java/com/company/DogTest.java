package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void shouldSayDogsAreEqual() {
        Dog dog1 = new Dog();
        dog1.setAge(3);
        dog1.setColor("Brown");
        dog1.setFavToy("Squeaky");

        Dog dog2 = new Dog();
        dog2.setAge(3);
        dog2.setColor("Brown");
        dog2.setFavToy("Squeaky");

        assertEquals(dog1, dog2);
    }

    @Test
    public void shouldBreedEqualDogs() {
        Breeder breeder = new Breeder();

        Dog dog1 = new Dog();
        dog1.setAge(3);
        dog1.setColor("Brown");
        dog1.setFavToy("Rope");

        Dog dog2 = new Dog();
        dog2.setAge(3);
        dog2.setColor("Grey");
        dog2.setFavToy("Ball");

        Dog dog3 = breeder.breedDogs(dog1, dog2);

        Dog dog4 = breeder.breedDogs(dog2, dog1);

        Dog dogTest = new Dog();
        dogTest.setAge(0);
        dogTest.setColor("BrownGrey");
        dogTest.setFavToy("Rope");

        assertEquals(dog3, dogTest);
        //assertEquals(dog4, dogTest);
    }

}
