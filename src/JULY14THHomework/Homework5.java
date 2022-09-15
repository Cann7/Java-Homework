package JULY14THHomework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        /*Write a code where user is asked to enter a number:
        Calculate the square of all the numbers from 0 to given number and print the result for each number,
         (square of a number is number*number == > 5*5 = 25 or 6*6 = 36*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int target = scan.nextInt();
        for (int i = 0; i <= target; i++) {
            System.out.println(i+"*"+i+"="+i*i);
        }
    }
}
