package inheritance;

public class Car extends Vehicle {
    int numDoors;
    int maxSpeed;
    public Car(){ // constructor
        System.out.println("Car's constructor");
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Car num doors "+numDoors);
    }
    public void printMaxSpeed(){
        super.maxSpeed = 150;
        System.out.println(maxSpeed+" "+super.maxSpeed);
    }
}
