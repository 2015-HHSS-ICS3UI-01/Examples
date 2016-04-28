
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
public class StringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // get a word from the user
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        //output the length of the word
        System.out.println("Your word is " + word.length() + " characters long");
        // checks to see if it starts with an L
        if(word.startsWith("L")){
            System.out.println("Your word begins with an L");
        }else{
            System.out.println("Your word does not begin with an L");
        }
        
        // change all 'a' to '@'
        String newWord = word.replace("a", "@");
        System.out.println(newWord);
        
        //using StringBuilder
        StringBuilder sBuilder = new StringBuilder(word);
        // find the first occuring 'a'
        int firstA = sBuilder.indexOf("a");
        // if an a is found
        if(firstA != -1){
            // remove the a
            sBuilder.deleteCharAt(firstA);
            // put an @ symbol in its place
            sBuilder.insert(firstA, "@");
        }
        
        //replace all 's' with '5'
        // go through every character of the word
        for(int i = 0; i < sBuilder.length(); i++){
            if(sBuilder.charAt(i) == 's'){
                // replace(start position, up to position, replace with)
                sBuilder.replace(i, i + 1, "5");
            }
        }
        
        // look for a lowercase L
        int firstL = sBuilder.indexOf("l");
        
        // found an L
        if(firstL != -1){
            // grabs all the letters up to the first L
            String starting = sBuilder.substring(0, firstL);
            // gets rid of everything up to the L
            sBuilder.delete(0, firstL);
            // adds the starting to the end
            sBuilder.append(starting);
        }
        
               
        // output the new word
        System.out.println(sBuilder);
    }
    
    
}
