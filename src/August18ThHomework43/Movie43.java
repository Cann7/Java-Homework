package August18ThHomework43;


import java.util.ArrayList;
import java.util.Scanner;

public class Movie43 {

//    Use previously created 5 Movie objects for task below:
//    Write a Method Where it takes List of Movies and The Type and Prints a name of the Movie as a suggestion to User based on the Rating
//    ex. Movie 1: Name: "Top Gun", Type = "Action",  Rating = 8.9, Star = "Tom Cruise"
//    Movies 2) Name: "Bullet Train", Type = "Action" Rating = 7.5, Star = "Brad Pitt"
//
//    Method(Arraylist Movie, String Type)
//    Print: We recommend this movie based on your choice :  Name: "Top Gun", Type = "Action",  Rating = 8.9, Star = "Tom Cruise"

    String Name;
    String Type;
    String Time;
    double Rating;
    String Star;

    public void Senario() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter a Movie Name : ");
        this.Name = scn.nextLine();
        System.out.println("Please Enter a Movie Type : ");
        this.Type = scn.nextLine();
        System.out.println("Please Enter a Movie Time : ");
        this.Time = scn.nextLine();
        System.out.println("Please Enter The Movie Rating Out of 10 : ");
        this.Rating = scn.nextDouble();
        System.out.println("Please Enter The Name of Movie Star :  ");
        this.Star = scn.nextLine();
        this.Star = scn.nextLine();
    }

    public static void movieSuggestion() {
        //first step should add movies to object
        ArrayList<Movie43> allMoviews = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            Movie43 flm = new Movie43();
            flm.Senario();
            allMoviews.add(flm);

        }
        for (int i = 0; i < allMoviews.size(); i++) {
            if (allMoviews.get(i).Rating > 7) {
                System.out.println(allMoviews.get(i).Name + " " + allMoviews.get(i).Type + " " + allMoviews.get(i).Time + " " + allMoviews.get(i).Rating + " " + allMoviews.get(i).Star);
            }

        }

    }

    public static void main(String[] args) {
        Movie43 obj1 = new Movie43();
        obj1.movieSuggestion();
        {

        }

    }
}