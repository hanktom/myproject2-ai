package com.tom.ticket;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static int TAICHUNG_CITY = 200;
    public static int KAOHSIUNG_CITY = 300;

    int price;
    Station start;
    Station destination;
    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
    }

    public void print() {
//        taipeiCity = 100;
    }
}
