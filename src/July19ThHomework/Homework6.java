package July19ThHomework;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        /**Write a code where it ask user to enter an integer number
         - Reverse the given number and print the result
         - Example input ( 5678 )
         - Example output ( 8765 )
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a integer number");
        int n = scn.nextInt();
        String f=(String.valueOf(n));
        int i =f.length()-1;
        String reverse="";

        do {
            reverse+=f.charAt(i);
            i--;
        }while(i>=0);

        System.out.println("Reverse Number : " +reverse);

    }
}
