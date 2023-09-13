package java2023.day3;

public class Q1e extends Fruit {
    public Q1e(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Q1e myApple = new Q1e("Green Apple");
    }
}

class Fruit {
    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
}


