package com.tom.score;

public class ScoringNG {

    public static void main(String[] args) {
        //5 students each english and math
        int[] englishs = {75, 80, 88, 45, 78};
        int[] maths = {80, 90, 100, 66, 77};
        String[] name = {"Jack", "Hank", "Jane", "Elva", "Steve"};
        for (int i = 0; i < 5; i++) {
            if (i!=1) {
                System.out.println(name[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t" + (englishs[i] + maths[i]) / 2);
            }
        }
    }
}
