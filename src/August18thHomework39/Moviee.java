package August18thHomework39;

import java.util.Scanner;

public class Moviee {
//    Write "Movie" Class Where it has following Attribute (Instance Variables)
//1) String "Name"
//2) String "Type"
//3) double "Rating" (out of 10) ex: 8.7
//4) String "Star" ex: Tom Hanks
//Every time when you are creating an object from Movie Class, User should be prompt to Enter the attributes (hint Scanner)

    String Name;
    String Type;
    String Time;
    double Rating;
    String Star;

    public Moviee(){
        Scanner scn =new Scanner(System.in);
        System.out.println("Please Enter a Movie Name : ");
        this.Name=scn.nextLine();
        System.out.println("Please Enter a Movie Type : ");
        this.Type=scn.nextLine();
        System.out.println("Please Enter a Movie Time : ");
        this.Time=scn.nextLine();
        System.out.println("Please Enter The Movie Rating Out of 10 : ");
        this.Rating=scn.nextDouble();
        System.out.println("Please Enter The Name of Movie Star :  ");
        this.Star=scn.nextLine();
        this.Star=scn.nextLine();

    }
    public String Print(){
        return "Movie name : " +Name+ " \nMovie Type : " + Type+ " \nMovie Time " + Time + " \nMovie Rating : " + Rating+ " \nMovie Star : " +Star;
    }


}
