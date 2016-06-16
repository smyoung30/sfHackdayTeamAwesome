package com.sf.hackday.goodneighbor.discount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class DiscountListView  {

    private List<DiscountDisplay> displayInfoList;

    public DiscountListView() {
        displayInfoList = new ArrayList<>();
    }

    public List<DiscountDisplay> createDiscountListInfo(){

        String[] names = {"Student Discount", "Multi-policy Discount", "Loyalty Discount", "Senior Citizen Discount"};

        displayInfoList.add(new DiscountDisplay(2, names[0]));
        displayInfoList.add(new DiscountDisplay(1, names[1]));
        displayInfoList.add(new DiscountDisplay(0, names[2]));
        displayInfoList.add(new DiscountDisplay(2, names[3]));

        return displayInfoList;
    }

}
