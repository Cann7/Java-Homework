package JULY14THHomework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        /*
        Write a code where user is asked to enter a number.
        Find the sum of all the even numbers between 0 to that number (included)
        Find the sum of all the odd numbers between 0 to that number (included)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter The Numbers");
        int num=scan.nextInt();
        int evenNumber=0;
        int oddNumber=0;
        for (int i = 0; i <=num ; i++) {
            if (i%2==0){
                evenNumber+=i;
            }else {
                oddNumber+=i;
            }

        }
        System.out.println("sum of all the even numbers : "+evenNumber);
        System.out.println("odd of all the odd numbers   : "+oddNumber);

    }
}
