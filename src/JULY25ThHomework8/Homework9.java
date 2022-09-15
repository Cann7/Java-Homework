package JULY25ThHomework8;

public class Homework9 {
    public static void main(String[] args) {

        /*
          write a code with following requirements
        - define an array with following values {90,34,23,87,45,36,98}
        - Print the values that can be divided by 2 or 3
         */

        int [] N={90,34,23,87,45,36,98};

        for (int i = 0; i < N.length; i++) {

            if (N[i]%2==0 || N[i]%3==0){
                System.out.println("The numbers CAN be divided by 2 or 3 : "+N[i]);
            }else {
                System.out.println("                   The numbers CAN NOT be divided by 2 or 3 : "+N[i]);
            }

        }





    }
}
