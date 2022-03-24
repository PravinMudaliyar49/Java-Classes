// package OOPS;

public class tester {
    public static void main(String[] args) {
        Human bhavesh = new Human();
        bhavesh.age = 19;
        bhavesh.hasTwoEyes = true;
        bhavesh.sirname = "Kodam";

        bhavesh.talk();

        Person p = new Person();
        p.name = "Bhavesh";
        p.age = 19;
        p.saysHi();

        Person p2 = new Person();
        p2.name = "Tarun";
        p2.age = 19;
        p2.saysHi();

        p.saysHi();
    }
}

class Human {
    int age;
    boolean hasTwoEyes;
    String sirname;

    void run() {

    }

    void jump() {

    }

    void talk() {
        System.out.println("Somthing random talks");
    }

}

class Person{
    String name;
    int age;

    void saysHi(){
        System.out.println(name + " of this age : " + age + " says hii.");
    }

}
