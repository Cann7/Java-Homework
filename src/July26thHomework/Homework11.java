package July26thHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        /** Write   a   program   that   creates   an   array   of   10   elements   size.
        Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
        array   elements.
         **/

        Scanner scn =new Scanner(System.in);
        System.out.println("Pleaase enter a Numbers");

        int [] N=new int[10];
        int sum=0;

        for (int i = 0; i < N.length; i++) {
            N[i]= scn.nextInt();
            sum+=N[i];
        }
        System.out.println(Arrays.toString(N));
        System.out.println("Total numbers are : " +sum);



    }
}
