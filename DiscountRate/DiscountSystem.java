package DiscountRate;

import java.util.HashMap;

public class DiscountSystem {
    private HashMap<String, Discount> discount;
    public DiscountSystem() {
        discount.put("Premium", new Discount(0.2, 0.1));
        discount.put("Gold", new Discount(0.15, 0.1));
        discount.put("Silver", new Discount(0.1, 0.1));
    }
}
