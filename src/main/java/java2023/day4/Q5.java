package java2023.day4;

//Empty PlanElement interface
interface PlanElement {
 // no methods
}

//Leg interface extending PlanElement
interface Leg extends PlanElement {
 public String getMode();
 public void setMode(String mode);
 public double getDepartureTime();
 public void setDepartureTime(final double seconds);
 public double getTravelTime();
 public void setTravelTime(final double seconds);
 public void setVehicle(Vehicle v);
 public Vehicle getVehicle();
}

//Sample Vehicle class
class Vehicle {
 private String id;

 public Vehicle(String id) {
     this.id = id;
 }

 public String getId() {
     return id;
 }
}

//Implementation of Leg interface
class LegImpl implements Leg {
 private String mode;
 private double departureTime;
 private double travelTime;
 private Vehicle vehicle;

 @Override
 public String getMode() {
     return mode;
 }

 @Override
 public void setMode(String mode) {
     this.mode = mode;
 }

 @Override
 public double getDepartureTime() {
     return departureTime;
 }

 @Override
 public void setDepartureTime(double seconds) {
     this.departureTime = seconds;
 }

 @Override
 public double getTravelTime() {
     return travelTime;
 }

 @Override
 public void setTravelTime(double seconds) {
     this.travelTime = seconds;
 }

 @Override
 public void setVehicle(Vehicle v) {
     this.vehicle = v;
 }

 @Override
 public Vehicle getVehicle() {
     return vehicle;
 }
}

//Test Class
public class Q5 {
 public static void main(String[] args) {
     Leg leg = new LegImpl();
     leg.setMode("Car");
     leg.setDepartureTime(3600);
     leg.setTravelTime(1800);
     
     Vehicle vehicle = new Vehicle("V1234");
     leg.setVehicle(vehicle);
     
     System.out.println("Mode: " + leg.getMode());
     System.out.println("Departure Time: " + leg.getDepartureTime() + " seconds");
     System.out.println("Travel Time: " + leg.getTravelTime() + " seconds");
     System.out.println("Vehicle ID: " + leg.getVehicle().getId());
 }
}

