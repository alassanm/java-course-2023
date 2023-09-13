package java2023.day3;

import java.util.ArrayList;

//Vehicle class
class Vehicle {
 private String id;

 public Vehicle(String id) {
     this.id = id;
 }

 public String getId() {
     return id;
 }
}

//Car class
class Car extends Vehicle {
 private int capacity;
 private double length;
 private String manufacturer;

 public Car(String id, int capacity, double length, String manufacturer) {
     super(id);
     this.capacity = capacity;
     this.length = length;
     this.manufacturer = manufacturer;
 }

 public int getCapacity() {
     return capacity;
 }

 public double getLength() {
     return length;
 }

 public String getManufacturer() {
     return manufacturer;
 }
}

//Bus class
class Bus extends Vehicle {
 private int standingCapacity;
 private int sittingCapacity;
 private double length;
 private String company;

 public Bus(String id, int standingCapacity, int sittingCapacity, double length, String company) {
     super(id);
     this.standingCapacity = standingCapacity;
     this.sittingCapacity = sittingCapacity;
     this.length = length;
     this.company = company;
 }

 public int getStandingCapacity() {
     return standingCapacity;
 }

 public int getSittingCapacity() {
     return sittingCapacity;
 }

 public double getLength() {
     return length;
 }

 public String getCompany() {
     return company;
 }
}

//Class containing link and vehicles
class LinkInfo {
 private ArrayList<Vehicle> vehicles = new ArrayList<>();
 private static final int MAX_VEHICLES = 100;

 public void addVehicle(Vehicle v) {
     if (vehicles.size() < MAX_VEHICLES) {
         vehicles.add(v);
     }
 }

 public void removeVehicle(String id) {
     vehicles.removeIf(v -> v.getId().equals(id));
 }

 public void outputVehicleDetails() {
     for (Vehicle v : vehicles) {
         if (v instanceof Car) {
             Car car = (Car) v;
             System.out.println("Car - ID: " + car.getId() + ", Capacity: " + car.getCapacity() + ", Length: " + car.getLength());
         } else if (v instanceof Bus) {
             Bus bus = (Bus) v;
             System.out.println("Bus - ID: " + bus.getId() + ", Standing Capacity: " + bus.getStandingCapacity() + ", Sitting Capacity: " + bus.getSittingCapacity() + ", Length: " + bus.getLength());
         }
     }
 }
}

//Test program
public class Q5 {
 public static void main(String[] args) {
     LinkInfo link = new LinkInfo();

     Car car1 = new Car("Car1", 4, 3.5, "Toyota");
     Car car2 = new Car("Car2", 5, 4.0, "Honda");
     Bus bus1 = new Bus("Bus1", 10, 20, 10.5, "CompanyA");
     Bus bus2 = new Bus("Bus2", 12, 18, 9.5, "CompanyB");

     link.addVehicle(car1);
     link.addVehicle(car2);
     link.addVehicle(bus1);
     link.addVehicle(bus2);

     link.outputVehicleDetails();

     link.removeVehicle("Car1");
     link.removeVehicle("Bus2");

     System.out.println("After removing some vehicles:");
     link.outputVehicleDetails();
 }
}

