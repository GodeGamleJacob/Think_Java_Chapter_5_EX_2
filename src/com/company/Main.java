package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {                                     //TODO SUPER FIN KODE :)

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(50) + 1;
                                                         //TODO HELE DENNE TEKST KAN LÆGGES I ÉN PRINTSÆTNING:
        System.out.println("Oh... hello there!");        //TODO System.out.println("Oh... hello there!\n\nI want us to play a little game... og så videre" );
        System.out.println("\n");                        //TODO alternativ: System.out.println("Oh... hello there!"+"\n"+"\n"+"I want us to play a little game..."+"og så videre" );
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
            System.out.println("\n");                           //TODO SAMMEN MED FORRIGE TEKST: System.out.println("Your guess was " + YourNumber+"\n\n\n"); der er tre \n for at erstatte println

            if (YourNumber != number) {
                if (YourNumber > number) {
                    System.out.println("Your guess was a little too high."); 
                    System.out.println("\n");                   //TODO TEKST LÆGGES SAMMEN
                }

                else {
                    System.out.println("Your guess is a bit too low.");
                    System.out.println("\n");                   //TODO TEKST LÆGGES SAMMEN
                }

            }

            else {
                System.out.println("Yay! You were correct!");
            }

            if (i == 2) {
                System.out.println("You ran out of guesses.");
                System.out.println("\n");                       //TODO TEKST LÆGGES SAMMEN
                System.out.println("The correct number was: " + number); //TODO TEKST LÆGGES SAMMEN
            }
        }
    }
}
