package com.tom.sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    public int getReturnMoney() {
        return (int)(amount*0.1f);
    }

    @Override
    public void print() {
        System.out.print(id + "\t" + amount + "\t" + (amount-getOffMoney())+"("+getReturnMoney()+")");
    }
}
