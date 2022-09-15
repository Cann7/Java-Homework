package July26thHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        // Write a code where user is asked to enter for 5 employee salaries and store those salaries
        // Then find the average salary of those 5 employees


        Scanner scn =new Scanner(System.in);
        System.out.println("Enter a Employes Salaries ");
        double[] S= new double[5];
        int sum=0;

        int i =0;
        while(i<5){
            System.out.println((i+1)+")" + " Salary of Employes : ");
            double sal= scn.nextDouble();
            S[i]=sal;
            i++;
        }
        for (int k = 0; k < S.length; k++) {
           sum+=S[k];
        }
        double averageS = (double) sum/ S.length;

        System.out.println(Arrays.toString(S));
        System.out.println("Average of Emplyoes : "+averageS);


    }
}
