public class Quiz6_inrerface {

//With default functions in interfaces, there is a possibility
// that a class is implementing two interfaces with same default methods.
// The following code explains how this ambiguity can be resolved.
public static  void main (String args[]){
    Vehicle vehicle =new Car();
    vehicle.print();
}
}
interface   Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }
    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");

    }
}

class Car implements  Vehicle,FourWheeler{
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
        }