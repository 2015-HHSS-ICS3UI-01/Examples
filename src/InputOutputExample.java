
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
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // Get the users name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        // say hello
        System.out.println("Hello " + name + ". What year were you born?");
        
        int birthYear = input.nextInt();
        int age = 2015 - birthYear;
        
        // tell them their age
        System.out.println("You are " + age + " years old!");
        
        // comment about their age
        if(age >= 20){
            System.out.println("You are old!");
        }else if(age > 12 && age < 20)
        {
            System.out.println("You are a teen");
        }else{
            System.out.println("How are you doing this?");
        }
        
        
        
        
    }
    
}
