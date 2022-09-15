public class studyhallmahirtipcal {
    public static void main(String[] args) {
        /* Tip Calculator  [if-else]

        Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
        In his country, it's usual to tip 15% if the bill value is between 99 and 280.
        If the value is different, the tip is 20%.

        Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).

                Example: "The bill was 275, the tip was 41.25, and the total value 316.25

        Data to test 97 ,100, 275 , 25*/

        int bill = 580;
        double tip1 = bill* 0.15;
        double tip2 = bill*0.20;
        double totalbill1 = bill+tip1;
        double totalbill2 = bill+tip2;

        if(bill>=99 && bill<=280){
            totalbill1 =bill+tip1;
        }else
        totalbill2 = bill+tip2;

        System.out.println(bill>=99 && bill<=280 ? totalbill1 : totalbill2);
    }

}
