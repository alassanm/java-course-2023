package java2023.day3;

public class Q1d {
    public static void main(String[] args) {
        // Create an instance of the class to call instance method method1
        Q1d myInstance = new Q1d();
        myInstance.method1();
    }

    public void method1() {
        method2();
    }

    public static void method2() {
        // Create an instance of Circle within this method to get the radius
        Circle c = new Circle();
        System.out.println("What is radius " + c.getRadius());
    }
    
}


