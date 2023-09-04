package com.teachmeskills.homework11.part4;

public class Order {
    private long id;
    private String name;
    private double price;

    public Order (long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getDayCount() {return name;}

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

