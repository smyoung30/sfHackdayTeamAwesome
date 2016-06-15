package com.sf.hackday.goodneighbor.discount;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class DiscountDisplay {

    Discount discount;
    Discount discount2;
    DisplayIcon icon;

    public Discount getDiscount() {
        return discount;
    }
    public void setIcon(DisplayIcon icon) {
        this.icon = icon;
    }
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public DisplayIcon getIcon() {
        return icon;
    }
}
