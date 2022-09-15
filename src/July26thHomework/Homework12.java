package July26thHomework;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        //Write   a   Java   program   to   reverse   the   element   of   an   integer    array.
        int [] N = {15,7,24,62,21,5,11,99,-199};
        int [] rev=new int[9];

        int j = 0;

        for (int i = N.length-1; i >=0 ; i--) {
            rev[j]=N[i];
            j++;

        }
        System.out.println("Original numbers are : "+ Arrays.toString(N)+"\n");
        System.out.println("Reverse of Numbers are : "+ Arrays.toString(rev));

    }
}
