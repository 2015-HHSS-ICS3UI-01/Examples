
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
public class IOExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // store the user's name
        String name;
        // Create the Scanner to get input
        Scanner input = new Scanner(System.in);
        
        // Get the user's name
        System.out.println("Please enter your name");
        name = input.nextLine();
        
        // Greet the user
        System.out.println("Hello " + name);
        
        // Determine their "age"
        System.out.println("What year were you born in?");
        int birthYear = input.nextInt();
        int age = 2016 - birthYear;
        
        // Tell the user how old they will be
        System.out.println("You will be " + age + " years old at the end of 2016");
        
        
        
    }
    
}
