package August11ThHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework30 {
    public static void main(String[] args) {

//        Write a method where it takes 2 String arrays and returns to an ArrayList where it contains all of the elements of the Arrays
//                arr1   =   {"A",   "B",   "C"};
//        arr2   =   {"D",   "E",   "F",   "G"};
//        ist   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}

        String[] arr1={"A",   "B",   "C"};
        String[] arr2={"D",   "E",   "F",   "G"};

        ArrayList<String> concatedList= new ArrayList<>();

        concatedList.addAll(Arrays.asList(arr1));
        concatedList.addAll(Arrays.asList(arr2));

        System.out.println(concatedList);



    }
}
