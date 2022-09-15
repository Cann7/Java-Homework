package August11ThHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework31 {
//    Write a Method where it takes an Integer of ArrayList and returns to an Integer ArrayList where it contains only unique numbers
//    ex:   list==>   {1,1,2,3,3,4,5,6}
//    uniques   ==>   {2,4,5,6}
//
public static void main(String[] args) {

    ArrayList<Integer> Numbers=new ArrayList<>();
    Numbers.addAll(Arrays.asList(1,1,2,3,3,4,5,6));
    System.out.println("Ex lis : "+Arrays.asList(Numbers));
    Numbers.removeAll(Arrays.asList(1,3));
    System.out.println("Uniques : "+Numbers);


}

}
