
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class NumberGuessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a scanner for input
        Scanner input = new Scanner(System.in);

        // generates a random number from 1-100
        int number = (int) (Math.random() * (100) + 1);

        // keep track if the game is over
        boolean done = false;
        while (!done) {
            // get the user's guess
            System.out.println("Please guess a number between 1 and 100");
            int guess = input.nextInt();
            
            // makes sure guess is between 1-100
            while(guess > 100 || guess < 1){
                System.out.println("Try again");
                guess = input.nextInt();
            }
            
            // guess is too high
            if (guess > number) {
                System.out.println("Too high");
            }// Guess is too low
            else if (guess < number) {
                System.out.println("Too low");
            } // correct guess, stop the game
            else {
                System.out.println("Good work");
                done = true;
            }
        }
    }

}
