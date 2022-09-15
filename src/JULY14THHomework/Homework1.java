package JULY14THHomework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

         /*Write a code where user is asked to enter an integer number:
           1) Using the given number find the factorial of that number and Print the result.
              example: 5 ==> 5! = 5*4*3*2*1 = 120
          */

        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter Your Number");
        int FactNumber= scn.nextInt();
        long fN=1;

        for (int i = 1; i <=FactNumber ; i++) {
            fN*=i;
        }
        System.out.println("Factorial : "+FactNumber+"!" + " = " +fN);







    }

}
