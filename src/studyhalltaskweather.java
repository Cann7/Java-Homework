public class studyhalltaskweather {
    public static void main(String[] args) {

        /*Coding Alexa for Weather [multiple Conditions]

        New graduate Renastech students want to improve Alexa and they will add weather functionality;

        Please help students with the assignment below.
                -Ask the user what's temperature is Fahrenheit;

                -Convert the value to Celsius formula :  C = F-32 / 1.80

        if temperature is  -10 or below  ==> print it's too cold
        if temperature is between -10 and 0 ==> print  it's cold
        if temperature is between 0 and 15 ==> print it's not cold
        if temperature is between 15 and 40 ==>print it's warm
        if temperature is 40 and 60 ===> print it's extremely hot!!
        if temperature is above 60 ==> print hot as hell
        Data to test: -40 F , 5F , 50f, 82, 130F, 400F*/

        int  Fahrenheit = 400;
        double Celsius = (Fahrenheit-35)/1.80;
        String weather = "";

        if (Celsius<=0){
            weather ="too cold";
        }else if(Celsius<=0 && Celsius>=-10){
            weather = "cold";
        }else if(Celsius>=0 && Celsius<=15){
            weather = "its not cold";
        }else if(Celsius>=15 && Celsius<=40){
            weather = "its warm";
        }else if(Celsius>=40 && Celsius<=60){
            weather = "extremely hot";
        }else
            weather = "hot as hell";

        System.out.println("the weather is : " +weather);

        System.out.println(Celsius<=0 ? "too cold" : Celsius<=0 && Celsius>=-10 ? "cold" : Celsius>=0 && Celsius<=15 ? "its not cold" : Celsius>=15 && Celsius<=40 ? "its warm"
                : Celsius>=40 && Celsius<=60 ? "extremely hot" : "hot as hell");









    }

}
