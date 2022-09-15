package August6thHomework;

public class Homework28 {

//    Write a method where it takes a String and returns to a String by adding "Not" in front of the String only if It does not have "Not" in front of it already.
//
//            ex. a = "CAR'
//    notString("Car" )  == > "Not Car"
//    notString("Home"). ==> "Not Home"
//    notString("Not Home") == > "Home"


public static String Sentence(String N) {

    if (N.contains("not")) {
        System.out.println(N.replace("not", ""));
    } else {
        System.out.println("not" + N);
    }
    return N;
}

    public static void main(String[] args) {
        Sentence(" car");
    }


}
