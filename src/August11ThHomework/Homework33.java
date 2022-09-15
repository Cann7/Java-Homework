package August11ThHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework33 {
//    Write a method where it takes ArrayList of Stings and and the index, returns to the element of that index in the ArrayList

    public static void main(String[] args) {

        ArrayList<String> ArrList=new ArrayList<>();
        ArrList.addAll(Arrays.asList("FENERBAHCE","1907","SARI","LACIVERT"));
        System.out.println(ArrList);
        System.out.println(ArrList.get(0));
        ArrList.get(0);


    }
}
