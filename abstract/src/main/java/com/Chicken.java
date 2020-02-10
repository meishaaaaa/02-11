package com;

public abstract class Chicken {

    public abstract double getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }

    public void print(String Type, double Price) {
        System.out.format("100元可以买%s %d只\n", Type, (int) (100 / Price));

    }

}
