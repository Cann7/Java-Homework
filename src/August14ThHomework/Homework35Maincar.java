package August14ThHomework;


import java.util.ArrayList;

public class Homework35Maincar {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.SetAttributes("MERCEDES",2005,105);
        Car car2=new Car();
        car2.SetAttributes("OPEL",2022,80);
        Car car3=new Car();
        car3.SetAttributes("BMW",1989,66);
        Car car4=new Car();
        car4.SetAttributes("SAHIN",1994,50);

        car1.IncreaseSpeed(40);
        car1.DecreaseSpeed(12);
        car1.IncreaseSpeed(1);
       // if(car1.IncreaseSpeed(1)>79){
        //    System.out.println(car1.Print() + " is danger of getting ticket\"");
       // };
        car2.IncreaseSpeed(20);
        car2.DecreaseSpeed(5);
        car2.IncreaseSpeed(42);
        car3.IncreaseSpeed(20);
        car3.DecreaseSpeed(10);
        car3.IncreaseSpeed(2);
        car4.IncreaseSpeed(10);
        car4.DecreaseSpeed(8);
        car4.IncreaseSpeed(2);

        car1.Print();
        car2.Print();
        car3.Print();
        car4.Print();

        ArrayList<Car>RentaCar=new ArrayList<>();
        RentaCar.add(car1);
        RentaCar.add(car2);
        RentaCar.add(car3);
        RentaCar.add(car4);

        for (int i = 0; i < RentaCar.size(); i++) {
            if (RentaCar.get(i).Speed>79){
                System.out.println(RentaCar.get(i).Model +  " : " + "("+RentaCar.get(i).Speed + ") " +"       Danger of getting ticket " );
            }
        }

    }
}
