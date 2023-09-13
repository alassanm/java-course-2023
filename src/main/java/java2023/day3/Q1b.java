package java2023.day3;

public class Q1b {
    public static void main(String[] args) {
        // Create an instance of the ShowErrors class
        ShowErrors showErrors = new ShowErrors();
        
        // Call the method1 method
        showErrors.method1();
    }
}

class ShowErrors {
    public void method1() {
        Circle c = new Circle(); // Initialized before use
        System.out.println("What is radius " + c.getRadius());
    }
}

class Circle {
    private double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public Circle() {
        // Default constructor
    }
}



