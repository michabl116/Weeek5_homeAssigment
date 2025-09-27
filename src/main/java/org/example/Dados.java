package org.example;
import java.util.Random;

public class Dados {
    private int die1;
    private int die2;
    private Random random = new Random();

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int rollUntilDouble() {
        int attempts = 0;
        do {
            attempts++;
            roll();
            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            if (isDouble()) {
                System.out.println("You rolled a double!");
            } else {
                System.out.println("Try again.");
            }
        } while (!isDouble());

        System.out.println("After " + attempts + " try both reach the same value");
        return attempts;
    }


}