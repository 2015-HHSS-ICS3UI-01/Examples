
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
public class Methods {

    
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    public static void sayHello(String name, int count){
        for(int i = 0; i < count; i++){
            System.out.println("Hello " + name);
        }
    }
    
    public static void countDown(){
        for(int i = 10; i > 0; i--){
            System.out.println(i);
            
            // delay 300 milliseconds
            try{
                Thread.sleep(300);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static double areaCircle(double r){
        double area = Math.PI*Math.pow(r,2);
        return area;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        double radius = input.nextDouble();
        double answer = areaCircle(radius);
        System.out.println("The area of the circle is " + answer);
        
        sayHello("John", 3);
        countDown();
        sayHello("Frank");
        countDown();
        System.out.println("ALL DONE!");
    }
    
}
