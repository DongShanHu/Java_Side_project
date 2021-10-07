package Interface_quiz;

public class car  implements  vehicle,fourwheel{

    //create an own method that overrides the default implementation.
    public  void print(){
        System.out.println("I am a four wheeler car vehicle!");

        // call the default method of the specified interface using super.
        vehicle.super.print();

    }
}
