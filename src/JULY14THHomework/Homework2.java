package JULY14THHomework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

          /*
           Write a code where user is asked to enter a number and check for every number between 0 to that number to see
           how many number between 0 to that number can be divided to 3 and 5 and sum all those number, Print the result
           */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int number=scan.nextInt();
        int count=0;
        int sum=0;

        for (int i = 0; i <=number ; i++) {
            if (i%3==0 && i%5==0){
                sum+=i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println("there are sum numbers : "+count);


    }

}
