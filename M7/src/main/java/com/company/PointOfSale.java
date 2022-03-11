package com.company;

public class PointOfSale {

    private String flavor; // Assume only one flavor

    private int scoops; // Number of scoops

    private double price;

    private String container; // i.e., Cone or Cup

    private String toppings; // i.e., sprinkles, cookie crumbs, ...

    private double weight;

    public PointOfSale(String flavor, int scoops, double price, String container, String toppings, double weight) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.price = price;
        this.container = container;
        this.toppings = toppings;
        this.weight = weight;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
