package AugustHomework18th;

import August18ThHomework43.Movie43;
import August18thHomework40.Movieess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movies41 {
//    Use previously created 5 Movie objects for task below:
//    Write a Method where it takes List of Movies and a Name of Actor/Actress and returns the List of movies that Actor/Actress has been in.
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
        Movies41 flm1 =new Movies41();
        flm1.Senario();
        Movies41 flm2 =new Movies41();
        flm2.Senario();
        Movies41 flm3 =new Movies41();
        flm3.Senario();
        Movies41 flm4 =new  Movies41();
        flm4.Senario();
        Movies41 flm5 =new  Movies41();
        flm5.Senario();

        ArrayList<Movies41> filmss=new ArrayList<>();
        filmss.addAll(Arrays.asList(flm1,flm2,flm3,flm4,flm5));

        for (int i = 0; i < filmss.size(); i++) {

            if (filmss.get(i).Star.equalsIgnoreCase("Al Pacino")){
                System.out.println(filmss.get(i).Name + " Actor's is :  " +filmss.get(i).Star);
            }

        }
    }

    public static void main(String[] args) {
        Movies41 obj1=new Movies41();
        obj1.filmss();

    }
}

