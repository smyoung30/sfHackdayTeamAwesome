package com.sf.hackday.goodneighbor.discount;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class Discount {
    String name;
    int id;
    double discountAmount;

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
