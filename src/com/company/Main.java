package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(50) + 1;

        System.out.println("Oh... hello there!");
        System.out.println("\n");
        System.out.println("I want us to play a little game... ;)");
        System.out.println("\n");
        System.out.println("Can you guess the magic number and get your price?");
        System.out.println("\n");
        System.out.println("The number is between 1 and 50.");
        System.out.println("\n");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            int YourNumber = input.nextInt();
            System.out.println("\n");

            System.out.println("Your guess was " + YourNumber);
            System.out.println("\n");

            if (YourNumber != number) {
                if (YourNumber > number) {
                    System.out.println("Your guess was a little too high.");
                    System.out.println("\n");
                }

                else {
                    System.out.println("Your guess is a bit too low.");
                    System.out.println("\n");
                }

            }

            else {
                System.out.println("Yay! You were correct!");
            }

            if (i == 2) {
                System.out.println("You ran out of guesses.");
                System.out.println("\n");
                System.out.println("The correct number was: " + number);
            }
        }
    }
}
