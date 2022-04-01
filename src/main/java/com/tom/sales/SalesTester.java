package com.tom.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("001", 1200);
        Customer c2 = new Customer("002", 800);
        SilverCustomer c3 = new SilverCustomer("003", 2000);
        Customer c4 = new Customer("006", 500);
        GoldenCustomer c5 = new GoldenCustomer("007", 900);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        //0001  1200    1100
    }
}
