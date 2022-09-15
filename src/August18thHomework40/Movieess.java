package August18thHomework40;

import August18thHomework39.Moviee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movieess {
//    Use "Movie" Class to create objects.
//    Create 5 Movie instances (Objects)
//    Write a Method where it takes List of all the movies and returns to List of Movies those are "Action" types

    String Name;
    String Type;
    String Time;
    double Rating;
    String Star;

    public void Senario(){
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

    public void filmss(){
        Movieess Flm1 =new Movieess();
        Flm1.Senario();
        Movieess Flm2 =new Movieess();
        Flm2.Senario();
        Movieess Flm3 =new Movieess();
        Flm3.Senario();
        Movieess Flm4 =new Movieess();
        Flm4.Senario();
        Movieess Flm5 =new Movieess();
        Flm5.Senario();

        ArrayList<Movieess> filmss=new ArrayList<>();
        filmss.addAll(Arrays.asList(Flm1,Flm2,Flm3,Flm4,Flm5));

        for (int i = 0; i < filmss.size(); i++) {

            if (filmss.get(i).Type.equalsIgnoreCase("ACTION")){
                System.out.println("Those are action movies : " +filmss.get(i).Name);
            }

        }

    }

    public static void main(String[] args) {
        Movieess obj1=new Movieess();
        obj1.filmss();

    }

}
