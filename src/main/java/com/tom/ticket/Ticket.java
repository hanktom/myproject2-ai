package com.tom.ticket;

/*
台北  台中  高雄
   500  600
<=====1100====>
 */

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
        if (start == Station.TAIPEI_CITY) {
            if (destination ==  Station.TAICHUNG) {
                price = 500;
            } else {
                price = 1100;
            }
        } else if (start == Station.TAICHUNG) {
            if (destination == Station.KAOHSIUNG) {
                price = 600;
            } else {
                price = 500;
            }
        } else if (start == Station.KAOHSIUNG) {
            if (destination == Station.TAIPEI_CITY) {
                price = 110;
            } else {
                price = 600;
            }
        }
    }

    public void print() {
//        taipeiCity = 100;
    }
}
