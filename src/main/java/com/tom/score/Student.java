package com.tom.score;

import com.tom.score.Printable;

//修飾字 Modifier: public/沒有寫(package)/protected(子)/private
public class Student implements Printable {
    public String name;
    protected int english;
    protected int math;
    public Student(String name) { //Constructor
        this.name = name;
    }
    public Student(String name, int english, int math) { //Constructor
        this(name);
//        this.namex = name;
        this.english = english;
        this.math = math;
    }
    public Student() { //Default constructor

    }

    @Override
    public void print() {
        System.out.print(name + "\t" + english +
                "\t" + math + "\t" + getAverage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }
/*    public void print() {
        System.out.print(name + "\t" + english +
                "\t" + math + "\t" + getAverage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }*/

    public int getAverage() {
        return (english+math)/2;
    }
}
