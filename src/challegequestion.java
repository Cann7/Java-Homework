import java.util.Scanner;

public class challegequestion {
    /*Write a program Where user is being ask to select items from the list you presented for instance:
    Select 1 for Shirt
    Select 2 for pants
    select 3 for dress
    select 4 for hat
    select 5 for shoes
    User will select select one item each time and until users has 3 items.
    shirt price is = 40
    pants price is = 60
    dress price is = 100
    hat price is = 10
    shoes price is = 120
            if user total amount is more than 200, user will receive 20% off on the total price (edited)

        if user total amount is more than 150, user will receive 15% off on the total  price (edited)

        if user total amount is more than 100, user will receive 5% off on the total price (edited)*/
    public static void main(String[] args) {

        System.out.println("Welcome to shopping list \n 1) shirt \n 2) pants \n 3) dress \n 4) hat \n 5) shoes \n Select one of item");
        Scanner scn = new Scanner(System.in);
        double totalBill = 0;

        switch (scn.nextInt()){
            case 1 : totalBill+=40;
            break;
            case 2 : totalBill+=60;
                break;
            case 3 : totalBill+=100;
                break;
            case 4 : totalBill+=10;
                break;
            case 5 : totalBill+=120;
                break;
        }
        System.out.println("please pick up your second item Your total bill is : "  +totalBill);

        switch (scn.nextInt()){
            case 1 : totalBill+=40;
                break;
            case 2 : totalBill+=60;
                break;
            case 3 : totalBill+=100;
                break;
            case 4 : totalBill+=10;
                break;
            case 5 : totalBill+=120;
                break;
        }
        System.out.println("please pick up your third item Your total bill is : "  +totalBill);
        switch (scn.nextInt()){
            case 1 : totalBill+=40;
                break;
            case 2 : totalBill+=60;
                break;
            case 3 : totalBill+=100;
                break;
            case 4 : totalBill+=10;
                break;
            case 5 : totalBill+=120;
                break;
        }
       if (totalBill>200){
           System.out.println("Your discount is : %20 -   "  + (totalBill *0.20) + "CAD Before discount : " +totalBill+ " due today with tax :" +(totalBill - totalBill *0.20)*1.13);
       } else if (totalBill>150) {
           System.out.println("Your discount is : %15 -   "  + (totalBill *0.15) + "CAD Before discount : " +totalBill+ " due today with tax :" +(totalBill - totalBill *0.15)*1.13);
       }else if (totalBill>100){
           System.out.println("Your discount is : %5 -    "   + (totalBill *0.05) + "CAD Before discount : " +totalBill+ " due today with tax :" +(totalBill - totalBill *0.05)*1.13);
       }else{
           System.out.println("unfortunately we will not make a discount for you today Your total is : " +totalBill);
       }


    }
}
