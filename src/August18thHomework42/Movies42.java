package August18thHomework42;

import AugustHomework18th.Movies41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movies42 {
//    Use previously created 5 Movie objects for task below:
//    Write a Method Where It takes List of Movies and returns to the List of All the Actors/ Actress (Star)

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
        Movies42 flm1 =new Movies42();
        flm1.Senario();
        Movies42 flm2 =new Movies42();
        flm2.Senario();
        Movies42 flm3 =new Movies42();
        flm3.Senario();
        Movies42 flm4 =new  Movies42();
        flm4.Senario();
        Movies42 flm5 =new  Movies42();
        flm5.Senario();

        ArrayList<Movies42> filmss=new ArrayList<>();
        filmss.addAll(Arrays.asList(flm1,flm2,flm3,flm4,flm5));

        for (int i = 0; i < filmss.size(); i++) {

                System.out.println(filmss.get(i).Name + " The movie star is :  " +filmss.get(i).Star);

        }
    }

    public static void main(String[] args) {
        Movies42 obj1=new Movies42();
        obj1.filmss();

    }
}
