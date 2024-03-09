package inheritance;

public class Vehicle {
    public String color;
    protected int maxSpeed;
    public Vehicle(){ // constructor
        System.out.println("Vehicle's constructor");
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void print(){
        System.out.println("Vehicle color "+ color+" max speed"+ maxSpeed);
    }

}
