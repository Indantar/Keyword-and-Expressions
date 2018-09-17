package com.DawidKotwicki;

public class Main {

    public static void main(String[] args) {
        // mile is equal to 1.609344
        double km = (100 * 1.609344);
        int highscore = 50;
        if (highscore == 50){
            System.out.println("This is an expression");
        }

        int score = 100; //score = 100 is an expression
        if (score > 90){ // expression in brackets
            System.out.println("You got the high score"); // Expression in brackets
            score  = 0; //Expression itself
        }
    }
}
