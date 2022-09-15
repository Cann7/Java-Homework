import java.util.Scanner;

public class test {

        public static void main(String[] args) {

        /*Write a program Where user is being ask to select items from the list you presented for instance:
            Select 1 for Shirt
            Select 2 for pants
            select 3 for dress
            select 4 for hat
            select 5 for shoes
        User will select one item each time and until users has 3 items.
            shirt price is = 40
            pants price is = 60
            dress price is = 100
            hat price is = 10
            shoes price is = 120
        if user total amount is more than 200, user will receive 20% off on the total price
        if user total amount is more than 150, user will receive 15% off on the total  price
        if user total amount is more than 100, user will receive 5% off on the total price  */


            double shirt = 40, pants = 60, dress = 100, hat = 10, shoes = 120;
            Scanner input = new Scanner(System.in);
            System.out.println("Please Pick 3 items for check out!");
            System.out.println("1)Shirt\n2)Pants\n3)Dress\n4)Hat\n5)Shoes");
            double checkoutOne = input.nextDouble();

            if (checkoutOne == 1) {
                checkoutOne = shirt;
            } else if (checkoutOne == 2) {
                checkoutOne = pants;
            } else if (checkoutOne == 3) {
                checkoutOne = dress;
            } else if (checkoutOne == 4) {
                checkoutOne = hat;
            } else if (checkoutOne == 5) {
                checkoutOne = shoes;
            } else {
                System.out.println("Invalid selected!");
            }

            System.out.println("Please Select your second item!");
            System.out.println("1)Shirt\n2)Pants\n3)Dress\n4)Hat\n5)Shoes");
            double checkoutTwo = input.nextDouble();

            if (checkoutTwo == 1) {
                checkoutTwo = shirt;
            } else if (checkoutTwo == 2) {
                checkoutTwo = pants;
            } else if (checkoutTwo == 3) {
                checkoutTwo = dress;
            } else if (checkoutTwo == 4) {
                checkoutTwo = hat;
            } else if (checkoutTwo == 5) {
                checkoutTwo = shoes;
            }else {
                System.out.println("Invalid selected!");
            }

            System.out.println("Please Select your last item!");
            System.out.println("1)Shirt\n2)Pants\n3)Dress\n4)Hat\n5)Shoes");
            double checkoutThree = input.nextDouble();

            if (checkoutThree == 1){
                checkoutThree = shirt;
            } else if (checkoutThree == 2) {
                checkoutThree = pants;
            } else if (checkoutThree == 3) {
                checkoutThree = dress;
            } else if (checkoutThree == 4) {
                checkoutThree = hat;
            } else if (checkoutThree == 5) {
                checkoutThree = shoes;
            }else {
                System.out.println("Invalid selected!");
            }

            double total = checkoutOne + checkoutTwo + checkoutThree,discount1,finaltotal;
            String discount = "";



            if (total >= 200){
                discount = "%20";
                discount1 = total * .2;
                finaltotal = total - discount1;
                System.out.println("Your discount is "+discount);
                System.out.println("Your Total is: "+finaltotal);
            } else if (total >= 150 && total <199 ){
                discount = "%15";
                discount1 = total * .15;
                finaltotal = total - discount1;
                System.out.println("Your discount is "+discount);
                System.out.println("Your Total is: "+finaltotal);
            } else if (total >= 100 && total < 149) {
                discount = "%5";
                discount1 = total * .05;
                finaltotal = total - discount1;
                System.out.println("Your discount is "+discount);
                System.out.println("Your Total is: "+finaltotal);
            }else {
                System.out.println("No discount applied \n your total is :"+total);

            }



        }

}
