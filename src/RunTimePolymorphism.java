class Vehicle{
  public void drive(){
    System.out.println("Driving vehicle ...");
  }
}
 
class Car extends Vehicle{
  @Override
  public void drive(){
    System.out.println("Driving car...");
  }
}
 
class Truck extends Vehicle{
  @Override
  public void drive(){
    System.out.println("Driving truck...");
  }
   
  public void load(){
    System.out.println("Loading truck...");
  }
}
public class RunTimePolymorphism {
	 public static void main(String[] args) {
		    Vehicle vehicle = new Vehicle();
		    vehicle.drive();
		     
		    Vehicle carVehicle = new Car();
		    carVehicle.drive();
		     
		    Vehicle truckVehicle = new Truck();
		    truckVehicle.drive();
		     
		    //Compile time error
		    //truckVehicle.load();
		     
		    Truck truck = new Truck();
		    truck.load();
		    
		    StringBuffer s1=new StringBuffer("Hello");
		    int c=s1.capacity();
		    System.out.println(c);
		    System.out.println(s1.reverse());
		  }
}
