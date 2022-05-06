package com.tom.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                Station.TAIPEI_CITY,
                Station.KAOHSIUNG
        );
//        System.out.println(ticket.start.name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3");
        int choice = Integer.parseInt(scanner.next());
        Station startStation = null;
        switch (choice) {
            case 1:
                startStation = Station.TAIPEI_CITY;
                break;
            case 2:
                startStation = Station.TAICHUNG;
                break;
            case 3:
                startStation = Station.KAOHSIUNG;
                break;
        }
        System.out.println("Your destination station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        choice = Integer.parseInt(scanner.next());
        Station endStation = null;
        switch (choice) {
            case 1:
                endStation = Station.TAIPEI_CITY;
                break;
            case 2:
                endStation = Station.TAICHUNG;
                break;
            case 3:
                endStation = Station.KAOHSIUNG;
                break;
        }
        Ticket t = new Ticket(startStation, endStation);
        System.out.println(t.price);
        //what type of ticket?
        //how many tickets?
        //loop?
    }
}
