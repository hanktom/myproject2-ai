package com.tom.sales;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }

    @Override
    public float getOffMoney() {
        return amount*off;
    }
}
