package InterviewQuestion;

import java.util.Scanner;

public class July15ThHomework {
    public static void main(String[] args) {

        /** INTERVIEW QUESTION.


         * Task : Write a program that checks if a String is a Palindrome.
         *
         * Example: input : Java , output: java is not  palindrome
         * Example: input : kayak , output : kayak is a palindrome
         * Example: input level , ouput : level is a palindrome
         *
         * tip: A palindrome is a word, number, phrase, or other sequence of characters
         * which reads the same backward as forward, such as madam or racecar.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease Enter a Word");
        String word= scan.next();
        String reverse="";
       for (int i = word.length()-1; i>=0 ; i--) {
            reverse=reverse+word.charAt(i);
        }
       if (word.equals(reverse)){
           System.out.println("Input is palindrome");
       }else{
           System.out.println("Input is not palindrome");
       }

    }
}
