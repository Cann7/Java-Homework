package August6thHomework;

public class Homework26 {

    //Write a method that takes the day as an integer such as(1 for Monday, 2 for Tuesday, and so on)
    //and it returns a String value indicating "Go To Work" for weekdays and
      //  "Go Back to Sleep" weekends. Name your Method as (GotoSleeporWork)

    public static void main(String[] args) {
        System.out.println(GotoSleeporWork(4));
    }

    public static String GotoSleeporWork(int day){
        String F=(day==1||day==2||day==3||day==4||day==5)?"Unfortunately you have to Go To Work":(day==6||day==7)?"Good news you can Go Back to Sleep":"There is no days";
        return F;
    }

}
