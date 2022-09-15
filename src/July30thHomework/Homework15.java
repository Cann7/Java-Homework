package July30thHomework;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {

        /**Write a code where it ask user to enter a Sentence, Find the longest word in the sentence and print it with the length of it.
         ex. ,"I love being outside with my dog but I have a lot to do today"
         asnwer: Outside and the length is 7 **/

        Scanner scn =new Scanner(System.in);
        System.out.println("PLEASE ENTER A SENTENCE");
        String Nm=scn.nextLine();
        String [] arr=Nm.split(" ");
        String l =arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (l.length()<arr[i].length()){
                l=arr[i];
            }

        }
        System.out.println("Longest word is : "+l);
        System.out.println("length is : " +l.length());


    }
}
