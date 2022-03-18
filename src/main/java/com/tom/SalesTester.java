package com.tom;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("001", 1200);
        Customer c2 = new Customer("002", 800);
        SilverCustomer c3 = new SilverCustomer("003", 2000);
        c1.print();
        c2.print();
        c3.print();
        //0001  1200    1100
    }
}
