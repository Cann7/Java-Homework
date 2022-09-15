package JULY20THHomework;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

       /* Write code where:
        - User is asked to enter a string,
        - Use that string to see how many of 3 character substring is Palindrome
        - Print All the substring Palindrome Substrings
                - Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
        PS = This is a little hard question please give your best and make sure you only use the things we have learned so far. */

        System.out.println("Please enter the string");
        Scanner scn=new Scanner(System.in);
        String str1=scn.next();
        String subs="";
        int count=0;
        int i=0;

        do {
            if (str1.charAt(i)==str1.charAt(i+2)){
                count++;
                subs+=str1.substring(i,i+3)+" ";
            }
            i++;

        }while(i<=str1.length()-3);
        if(subs.length()<1){
            subs="There is no Palindrome";
        }else {
            subs="Substring Palindrome "+subs;
        }

        System.out.println("count " + count);
        System.out.println(subs);





















    }
}
