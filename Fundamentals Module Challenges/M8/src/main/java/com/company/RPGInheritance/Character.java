package com.company.RPGInheritance;

public class Character {

    private String name;

    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void run() {
        // Insert code here
    }

    public void attack() {
        // Insert code here
    }

    public void heal(int amount) {
        int total = amount + this.getHealth();
        this.setHealth(total);
    }

    public void decreaseHealth(int amount) {
        int total = this.getHealth() - amount;
        this.setHealth(total);
    }

    public void increaseStamina(int amount) {
        int total = amount + this.getStamina();
        this.setStamina(total);
    }

    public void decreaseStamina(int amount) {
        int total = this.getStamina() - amount;
        this.setStamina(total);
    }
}
