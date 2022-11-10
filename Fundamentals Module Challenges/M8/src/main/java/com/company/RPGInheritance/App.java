package com.company.RPGInheritance;

public class App {

    public static void main(String[] args) {

        Farmer farmer = new Farmer();
        Constable constable = new Constable();
        Warrior warrior = new Warrior();

        farmer.setStrength(75);
        farmer.setHealth(100);
        farmer.setStamina(75);
        farmer.setSpeed(10);
        farmer.setAttackPower(1);

        constable.setStrength(60);
        constable.setHealth(100);
        constable.setStamina(60);
        constable.setSpeed(20);
        constable.setAttackPower(5);

        warrior.setStrength(75);
        warrior.setHealth(100);
        warrior.setStamina(100);
        warrior.setSpeed(50);
        warrior.setAttackPower(10);
        warrior.setShieldStrength(100);

    }

}
