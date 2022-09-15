public class homework3task_3 {
    public static void main(String[] args) {

        //task   3:   create   Program   to   check   whether   the   given   number   is   positive   or   negative
        //      →   If   a   number   is   greater   than   zero   then   it   is   a   positive   number
       //              →   If   a   number   is   less   than   zero   then   it   is   a   negative   number
      //              →   If   a   number   is   equal   to   zero   then   it   is   neither   negative   nor   positive.

        int whetherDegree = -12;

        if (whetherDegree>0){ // when we checek the weather degeree greater then zero
            System.out.println("degree is a positive" );
        }else if(whetherDegree<0){ // when we are check the weather degree less thenn zero
            System.out.println("degree is a negative");

        }else{
            System.out.println("equal   to   zero   then   it   is   neither   negative   nor   positive.");
        }
        System.out.println(whetherDegree>0 ? "degree is a positive " : whetherDegree<0 ? "negative " : "equal   to   zero" );

    }

}
