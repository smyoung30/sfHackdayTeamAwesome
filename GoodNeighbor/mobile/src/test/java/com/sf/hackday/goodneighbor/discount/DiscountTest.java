package com.sf.hackday.goodneighbor.discount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by stephenyoung on 6/15/16.
 */


public class DiscountTest {

    Discount discount;
    @Before
    public void setUp() {
        discount = new Discount();
    }


    @Test
    public void test() throws Exception {

        discount.setName("Student");

        assertEquals("Student", discount.getName());
    }

    @Test
    public void idTest(){
        discount.setId(12);
        assertEquals(12, discount.getId());
    }

    @Test
    public void discountTest(){
        discount.setDiscountAmount(.3);
        assertEquals(.3, discount.getDiscountAmount(), .001);
    }

}
