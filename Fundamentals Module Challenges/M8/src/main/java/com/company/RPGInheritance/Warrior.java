package com.company.RPGInheritance;

public class Warrior extends Character {

    private int shieldStrength;

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public void decreaseShieldStrength(int amount) {
        int total = this.getShieldStrength() - amount;
        this.setShieldStrength(total);
    }
}
