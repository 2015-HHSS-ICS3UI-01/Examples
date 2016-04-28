
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
public class Quiz5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.println("Please enter a word to translate");
            String word = in.nextLine();
            String can = word;
            if(word.equals("quit!")){
                break;
            }
            if(can.length() > 4 && can.endsWith("or")){
                int almostLast = can.length() - 3;
                char constCheck = can.charAt(almostLast);
                if(constCheck != 'a' && constCheck != 'e' && constCheck != 'i' 
                        && constCheck != 'o' && constCheck != 'u' && constCheck != 'y'){
                    can = can.substring(0,almostLast + 1) + "our";
                }
            }
            System.out.println(word + " in Canadian is " + can);
        }
    }
}
