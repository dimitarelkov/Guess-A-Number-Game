package PrcaticalProjects;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random ();


        int computerNumber = randomNumber.nextInt(100);
        System.out.println("Guess a number (1-100): ");

        int playerNumber = Integer.parseInt(scanner.nextLine());


        while (playerNumber != computerNumber) {



           if (playerNumber > computerNumber) {
               System.out.println("Too high");

           } else if (playerNumber < computerNumber) {
                System.out.println("Too Law");

            } else {
               System.out.println("Invalid Input.");

           }
            playerNumber = Integer.parseInt(scanner.nextLine());



        }
        if (playerNumber == computerNumber)  {
            System.out.println("You guessed it!");
        }
    }
}
