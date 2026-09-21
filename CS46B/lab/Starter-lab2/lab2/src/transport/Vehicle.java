package transport;

public class Vehicle {
    private int nWheels = 0;

    public Vehicle(int nWheels){
        this.nWheels = nWheels;
        System.out.println("Vehicle constructor");
    } 

    public static void main(String[] args) {
        Vehicle v = new Vehicle(4);
    }
}

class UnmannedVehicle extends Vehicle{
    public UnmannedVehicle(){
        super(4);
        System.out.println("UnmannedVehicle constructor");
    }
}

class MarsRover extends UnmannedVehicle{
    public MarsRover(){System.out.println("MarsRover constructor");}

}


/*What source code elements did VS Code automatically create?
package src.transport;

public class Vehicle {

}
*/

/* If you added the below line of code to Vehicle.java, would you get a
compiler error? Why or why not?

No, java will create a default constructor so the program can still been compile.
*/

/*What error message do you
get from VS Code?

The value of the local variable v is not used
*/

/*If you comment out the Vehicle constructor, what happens to the error message in UnmannedVehicle?

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The constructor Vehicle() is undefined
*/


