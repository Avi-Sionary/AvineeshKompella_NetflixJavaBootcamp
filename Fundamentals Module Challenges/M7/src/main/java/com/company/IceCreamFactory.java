package com.company;

public class IceCreamFactory {

    private String[] flavors; // Different ice cream flavors produced at factory

    private int boxes; // Number of boxes to ship

    private double price; // total price of the boxes to be shipped

    private String deliveryPoint; // Where to deliver the ice cream to

    private double weight; // total weight of the boxes to be shipped

    public IceCreamFactory(String[] flavors, int boxes, double price, String deliveryPoint, double weight) {
        this.flavors = flavors;
        this.boxes = boxes;
        this.price = price;
        this.deliveryPoint = deliveryPoint;
        this.weight = weight;
    }

    public String[] getFlavors() {
        return flavors;
    }

    public void setFlavors(String[] flavors) {
        this.flavors = flavors;
    }

    public int getBoxes() {
        return boxes;
    }

    public void setBoxes(int boxes) {
        this.boxes = boxes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
