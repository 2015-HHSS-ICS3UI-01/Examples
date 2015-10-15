
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 2015;
        int birthYear = 1985;
        int age = year - birthYear;
        System.out.println("Your age is " + age);
        double area = 1836.36;
        boolean switchOn = year <= 1985;
        char firstLetter = 'A';
        
        City kw = new City();
        Robot karel = new Robot(kw, 1,1, Direction.EAST);
        int moveAmount = 5;
        while(moveAmount > 0){
            karel.move();
            moveAmount = moveAmount - 1;
        }
        
        moveAmount -= 5;
        
        Robot tina = new Robot(kw, 2,1,Direction.EAST);
        for(int moveCount = 5; moveCount > 0; moveCount--){
            tina.move();
        }
        
        
        
        
    }
    
}
