package JULY25ThHomework8;

public class Homework10 {
    public static void main(String[] args) {

        /**
          Write   a   statement   that   declares   a   string   array   initialized   with   the   following   strings:
         "Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
         Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.*
         **/

        String [] WeekDays={"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday" , "Saturday"};

        for (int i = 0; i < WeekDays.length ; i++) {
            System.out.println(i+1+")"+WeekDays[i]);

        }

    }

}
