package org.ocihan.factory;

public abstract class Plan {
    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate + "TL");
    }
}
