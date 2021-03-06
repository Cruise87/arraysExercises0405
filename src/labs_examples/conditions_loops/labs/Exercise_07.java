package labs_examples.conditions_loops.labs;
import java.util.*;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word to return the word and it's first vowel: ");
        String str = s.next();
        String vowels = "aeiou";
        int count = 0;
        while(str.length()> count){
            if(vowels.indexOf(str.charAt(count)) >= 0){
                System.out.println("The word is: " + str);
                System.out.println("The first vowel in the word is: " + str.charAt(count));
                break;
            }
            count++;
        }
    }
}