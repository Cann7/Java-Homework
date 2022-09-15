package August6thHomework;

public class Homework27 {
//    We have two monkeys,   a   and b,   and the parameters aSmile and bSmile indicate if each is smiling.
//    We are in trouble if they are both smiling or if neither of them is smiling.   Return true if we are in
//trouble.
//        monkeyTrouble(true,   true)   →   true
//    monkeyTrouble(false,   false)   →   true
//    monkeyTrouble(true,   false)   →   false

    public static boolean Monkeys(boolean aSmile, boolean bSmile){
        return (aSmile==bSmile || !aSmile==!bSmile);
    }

    public static void main(String[] args) {
        boolean i1=true;
        boolean i2=true;
        boolean Fn=Monkeys(i1,i2);
        System.out.println("monkeyTrouble: "+Fn);
        System.out.println(Fn?"We have a problem":"We are okay");
    }

}
