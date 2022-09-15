package JULY14THHomework;

import java.util.Scanner;

public class interviewQuestion {
    /**
     * Given an integer n, return a string array answer (1-indexed) where:
     *
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     *
     *
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("there are numbers from N to 0 ");
        int num = scn.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");

            } else if (i%5==0) {
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }


        }


    }
}
