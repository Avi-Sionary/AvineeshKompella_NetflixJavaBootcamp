package com.company;

public class City {

    private String name;
    private int population;
    private State state;
    private boolean capital;

    public City(String name, int population, State state, boolean capital) {
        this.name = name;
        this.population = population;
        this.state = state;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }
}