package com.sf.hackday.goodneighbor.discount;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class DiscountDisplay {


    private int icon;
    private String prompt;

    public DiscountDisplay(int icon, String prompt) {
        this.icon = icon;
        this.prompt = prompt;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    //    Discount discount;
//    DisplayIcon icon;
//
//    public DiscountDisplay(Discount discount, DisplayIcon icon) {
//        this.discount = discount;
//        this.icon = icon;
//    }
//
//    public Discount getDiscount() {
//        return discount;
//    }
//    public void setIcon(DisplayIcon icon) {
//        this.icon = icon;
//    }
//    public void setDiscount(Discount discount) {
//        this.discount = discount;
//    }
//    public DisplayIcon getIcon() {
//        return icon;
//    }
}
