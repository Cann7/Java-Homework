package July30thHomework;

import java.util.Arrays;

public class Homework16 {
    public static void main(String[] args) {

        /**Write a code where you short all the integer values in an array in descending order (Do not use the Arrays.short() )
         */

        int [] cont={1,11,21,31,41,51,61};
        System.out.println("The Numbers are : "+ Arrays.toString(cont));

        for (int i = 0; i < cont.length/2; i++) {
            int num=cont[i];
            cont[i]=cont[cont.length-i-1];
            cont[cont.length-i-1]=num;
        }
        System.out.println("integer values in an array in descending order : "+Arrays.toString(cont));

    }
}
