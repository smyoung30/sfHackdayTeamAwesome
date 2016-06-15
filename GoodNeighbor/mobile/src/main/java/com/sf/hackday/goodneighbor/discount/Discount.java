package com.sf.hackday.goodneighbor.discount;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class Discount {
    String name;
    int id;
    double discountAmount;

    public Discount() {
        super();
        this.discountAmount = 0;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        if (discountAmount > 1) {
            this.discountAmount = 1;
        }
        if (discountAmount > 0){
            this.discountAmount = discountAmount;
        }
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
