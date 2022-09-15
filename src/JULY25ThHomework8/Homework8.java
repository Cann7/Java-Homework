package JULY25ThHomework8;

public class Homework8 {
    public static void main(String[] args) {

        /*Write a code with following requirements:
         - Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
         - Print the minimum number in the given array
         */

        int [] N = {6,7,2,3,90,-2,-90,-122,96,35};
        int min = N[0];

        for (int i = 0; i < N.length; i++) {

            if (min>N[i]){
                min=N[i];

            }
        }
        System.out.println("Minimum number is : "+min);

    }
}
