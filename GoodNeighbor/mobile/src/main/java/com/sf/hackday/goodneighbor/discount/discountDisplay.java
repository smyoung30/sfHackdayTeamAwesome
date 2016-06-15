package com.sf.hackday.goodneighbor.discount;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class DiscountDisplay {

    Discount discount;
    DisplayIcon icon;

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setIcon(DisplayIcon icon) {
        this.icon = icon;
    }

    public DisplayIcon getIcon() {
        return icon;
    }
}
