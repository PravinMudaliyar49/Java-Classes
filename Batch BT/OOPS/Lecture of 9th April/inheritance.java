// package Lecture of 9th April;

public class inheritance {

}

class tester {
    public static void main(String[] args) {
        // anonymous objects.

        // Animal a = new Animal();
        // a.speaks();

        // new Animal().speaks();

        // new Mammal().speaks();

        // new Human().speaks();

        // new Human().runs();

        // new Human().privateMethod(); Compile time error.

        // new Human().shouts(); Compile time error.

        // Animal a = new Animal();

        // Human tarun = new Human();
        // Human bhavesh = new Human();
        // Human pravin = new Human();

        

    }
}

class Animal {
    void speaks() {
        System.out.println("Animal speaks");
    }

    void runs() {
        System.out.println("Animal runs");
        System.out.println("Animal runs fast");
        System.out.println("Animal runs faster");
        System.out.println("Animal runs fastest");
    }

    private void privateMethod() {
        System.out.println("This is important!!!");
    }
}

class Mammal extends Animal {
    void speaks() {
        System.out.println("Mammal speaks");
    }

    void runs() {
        System.out.println("Mammal runs");
    }

}

class Human extends Mammal {
    int age;

    void runs() {
        // System.out.println("Human runs");
        // super.runs();
        System.out.println("Human runs fast");

    }
}

