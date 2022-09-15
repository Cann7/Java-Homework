public class homeworkTask3_1 {
    public static void main(String[] args) {

        //task   1:   create   a   java   program   that   will   check   if   number   is   divisible   by   2   and   5   same   time

        int num = 20;
        if (num % 2==0 && num % 5== 0){
            System.out.println("this number is divisible by 2 and 5 : " +num);

        }else {
            System.out.println("this number is not divisible by 2 and 5 :" +num);

        }
        System.out.println(num % 2==0 && num % 5== 0 ? "this number is divisible by 2 and 5 : " + num :"this number is not divisible by 2 and 5 :" +num );







    }

}
