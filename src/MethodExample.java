
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
public class MethodExample {

    public static void sayHello(){
        System.out.println("Hello");
    }
    
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    public static void sayHello(String name, int number){
        for(int i = 0; i < number; i++){
            System.out.println("Hello " + name);
        }
    }
    
    public static void toBinary(int num){
        // string to store the answer
        StringBuilder ans = new StringBuilder("");
        // storing the quotient and remainder
        int q = num;
        int r = 0;
        //while the q is not 0
        while(q != 0){
            // store the remainder 
            // when dividing by 2
            r = q % 2;
            // divide quotient
            q = q / 2;
            // append the remainder
            ans.append(r);
        }
        // write answer backwards
        ans.reverse();
        // output to screen
        System.out.println("Binary: " + ans);
    }
    
    // returns the distance between (x1,y1) and (x2,y2)
    public static double distance(int x1, int y1, int x2, int y2){
        double ans = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return ans;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayHello();
        sayHello("Mr. Lamont", 5);
        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the point (x1,y1) on seperate lines");
//        int x1 = input.nextInt();
//        int y1 = input.nextInt();
//        
//        System.out.println("Please enter the point (x2,y2) on seperate lines");
//        int secondX = input.nextInt();
//        int secondY = input.nextInt();
//        
//        // use my distance method
//        double distance = distance(x1,y1,secondX,secondY);
//        System.out.println("The distance between those points is " + distance);
        
        toBinary(2635);
    }
    
}
