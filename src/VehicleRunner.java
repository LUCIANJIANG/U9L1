public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle myBicycle = new Bicycle("Mountain Bike", 2, 21);
    System.out.println(myBicycle.getName()); // inherited method
    System.out.println(myBicycle.getWheels()); // inherited method
    System.out.println(myBicycle.getGearCount()); // method ONLY available on Car objects
    myBicycle.move(30); // inherited method
    myBicycle.turn(-90); // inherited method
    myBicycle.brake(0.50); // inherited method
    myBicycle.ringBell();

    SkateBoard skateboard = new SkateBoard("Skateboard", 4, "maplewood");
    System.out.println(skateboard.getName());
    System.out.println(skateboard.getWheels());
    System.out.println(skateboard.getBoardMaterial());
    skateboard.move(30);
    skateboard.turn(-90);
    skateboard.brake(0.50);
    skateboard.kickFlip();
  }
}