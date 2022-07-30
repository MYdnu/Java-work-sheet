package java_practice;

public class creating_class {

    public static void main(String args[]){
        int num = 5;

        aircraft plean1 = new aircraft();  // creat an object of class aircraft


       car toyota = new car();
       car bmw = new car();

       shoose nikeair = new shoose();
       nikeair.color ="red";
       nikeair.size = 41;
       nikeair.model = "Zu27";
       shoose addidas = new shoose();
       addidas.color = "blue";
    }
    


}

class aircraft{
    int passenger;             // numbers of people
    double speed;              // kilo meters per hour
    float fuelCapacity;       // gallons
    String clolor;             // clolor of the aircraft
    String model;              //model of aircraft


}

class car{

    int modelnum;
    char type;
    String color;
}
class shoose{

    int size;
    String color,model;
}
