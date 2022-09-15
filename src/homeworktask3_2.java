public class homeworktask3_2 {
    public static void main(String[] args) {
        //task   2:   write    java   program   to   find   the   largest   among   three   numbers.   1)   Using   if-else..if

        int num1 = 15;
        int num2 = 22;
        int num3 = 9;
        String resultText ="the biggest number : ";

        if (num1>num2 && num1>num3){
            System.out.println(resultText +num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println(resultText +num2);
        }else{
            System.out.println(resultText +num3);
        }

        System.out.println(num1>num2 && num1>num3 ? resultText +num1 : num2>num1 && num2>num3 ? resultText + num2 : resultText +num3 );
    }

}
