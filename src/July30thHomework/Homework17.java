package July30thHomework;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {

        /**
         * Write a code where user is asked to enter 10 numbers and store those number in the integer array.
         * Print the the max number and all the element in the array(Yo can use Arrays.toString() method)
         */

        Scanner scn =new Scanner(System.in);
        System.out.println("Please enter the 10 numbers");
        int [] num= new int[10];
        int maxNum=0;

        for (int i = 0; i < 10; i++) {
            int N= scn.nextInt();
            num[i]=N;

            if (num[i]>maxNum){
                maxNum=num[i];
            }

        }
        System.out.print("The numbers are : " + Arrays.toString(num)+"\n"+"Max Number is : " +maxNum);

    }
}
