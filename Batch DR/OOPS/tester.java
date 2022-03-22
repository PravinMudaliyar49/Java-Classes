package OOPS;

public class tester {
    public static void main(String[] args) {
        Human man = new Human();
        man.age = 20;
        man.name = "Random";

        man.speak();
        man.run();
    }
}

class Human {
    int age;
    String name;

    void run() {
        System.out.println("I am running");
    }

    void speak() {
        System.out.println("I am talking");
    }
}
