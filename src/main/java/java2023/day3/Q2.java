package java2023.day3;

public class Q2 {
    public static void main(String[] args) {
        Circlee circle1 = new Circlee(1);
        Circlee circle2 = new Circlee(2);
        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
    }

    public static void swap1(Circlee x, Circlee y) {
        Circlee temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(Circlee x, Circlee y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}

class Circlee {
    double radius;

    Circlee(double newRadius) {
        radius = newRadius;
    }
}

