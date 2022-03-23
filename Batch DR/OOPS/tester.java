package OOPS;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // man.age = 20;
        // man.name = "Random";
        
        // man.needs(sc.nextLine(), "Football");
        
        // man.speak();
        // man.run();
        
        Human man1 = new Human();
        man1.age = 20;
        man1.name = "Random";
        man1.introduceYourself();

        Human man2 = new Human();
        man2.introduceYourself();

    }
}

class Human {
    int age;
    String name;

    void introduceYourself(){
        System.out.println("My name is " + name + ". And my age is " + age + ".");
    }

    void run() {
        System.out.println("I am running");
    }

    void speak() {
        System.out.println("I am talking");
    }

    void needs(String food, String game){
        System.out.println("Humans needs are " + food + " and " + game);
    }
}
