package July30thHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {

        //Write a code where user is asked to enter a number to between 1 to 7 to get the name of the day of the week.User Array
        //ex. When user enters 1 you should print (Monday)

        String [] Days={"Monday","Tuesday","Wednesday","Thuersday","Friday","Saturday","Sunday"};
        Scanner scn=new Scanner(System.in);

        System.out.println("days of week = "+ Arrays.toString(Days));

        int n=scn.nextInt();
        System.out.println(n+ " Days : "  + Days[n-1]);


    }
}
