package August14ThHomework;

public class Car {
//    Write a Car Class where it has following attributes:
//1) Model
//2) Year
//3) Speed
//   and following method:
//1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
//2) PrintCar() - Where it prints each objects attributes
//3) IncreaseSpeed() - Where it takes double values and it increase the Speed attribute by input amount
//4) DecreaseSpeed() - Where it takes double values and it decrease the Speed attribute by input amount
//
//    Create 4 instance of Car Class, after Setting the Attribute values, Apply increaseSpeed and DecreaseSpeed Multiple times for different values.
//    For those which has speed of 80 or more, Print warning such as "Car "Model" and"Speed" is danger of getting ticket"

    String Model;
    int Year;
    double Speed;

    public void SetAttributes(String model,int year, double speed){
        Model =model;
        Year=year;
        Speed=speed;
    }

    public String Print(){
        String car=" [model] :   " + Model + "   [year] :     " + Year + "   [speed] :     " + Speed;
        return car;
    }

    public double IncreaseSpeed(double extraspeed){
        Speed+=extraspeed;
        return Speed;
    }
    public double DecreaseSpeed(double extraspeed){
        Speed-=extraspeed;
        return Speed;
    }

}


