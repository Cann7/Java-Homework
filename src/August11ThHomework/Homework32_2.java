package August11ThHomework;

import java.util.ArrayList;

public class Homework32_2 {
    //    Write a Method where it takes String and return ArrayList of All the numbers in the String
//    ex: String str = "This234 is ju3st St1in6"
//    srrlsit = {2,3,4,3,1,6}
//    hint in order to check if Character is a number or not ( boolean check = Character.isDigit(str.charAt(i) )
    public static void main(String[] args) {
        String Strng = "This234 is ju3st St1in6";
        char[] Arr = Strng.toCharArray();

        ArrayList<String> ArrList = new ArrayList<>();

        for (int i = 0; i < Strng.length(); i++) {
            boolean check=Character.isDigit(Strng.charAt(i));
            if(check==!false) {
                ArrList.add(String.valueOf(Arr[i]));
            }
        }
        System.out.println("The numbers are : "+ArrList);
    }
}
