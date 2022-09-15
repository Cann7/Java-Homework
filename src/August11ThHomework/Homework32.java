package August11ThHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework32 {
//    Write methods where it takes the ArrayList of Double
//1) first method returns to max number
//2) second metod returns to min number
//3) third Method prints all element one by one on the same line ( ex = the List is: 100.9, 12.45, 30.46 )
public static void main(String[] args) {

    ArrayList<Double> ArrList= new ArrayList<>();

    ArrList.addAll(Arrays.asList(100.09,12.45, 30.46));
    System.out.println("The max number is : "+ Collections.max(ArrList));
    System.out.println("The min number is : "+ Collections.min(ArrList));
    System.out.println("All Element List : "+ArrList);


}
}
