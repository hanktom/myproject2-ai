package com.tom.ticket;

public class Station {
    public static final Station TAIPEI_CITY =
            new Station(100, "Taipei");
    public static final Station TAICHUNG =
            new Station(200, "Taichung");
    public static final Station KAOHSIUNG =
            new Station(300, "Kaohsing");
    int id;
    String name;
    public Station(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
