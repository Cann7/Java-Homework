package August6thHomework;

public class Homework29 {
//    Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string,
//    but also could handle a situation where It takes 2 String and 1 integer value where it only prints the 2 strings by integer value times.
//            ex -  ConcatandPrint("FirstName","LastName") it will return ==> FirstNameLastName
//    ConcatandPrint("FirstName","LastName", 3) it will print ==> "FirstName" and "Lastname" 3 times.

    // The Concept do while loop is
    // do{
    // code block
    // }while(condition);

    public static String ConcatandPrint(String Fname,String Lname, int t){
        int n=0;
        do{
            if (t==0){
                System.out.println(Fname.concat(Lname));
                break;
            }else {
                System.out.println(Fname.concat(Lname));
                n++;
            }
        }while(n!=t);
        return Fname;
    }

    public static String ConcatandPrint(String Fname,String Lname){
        return Fname.concat(" "+Lname);
    }

    public static void main(String[] args) {
        ConcatandPrint("alican ","coskun ",3);
        System.out.println("***************************");
      String st=  ConcatandPrint("ALICAN","COSKUN");
        System.out.println(st);

    }







}
