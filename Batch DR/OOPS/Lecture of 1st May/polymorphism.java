public class polymorphism {

}

class Mammal {
    boolean age;

    void walks() {
        System.out.println("Mammal walks.");
    }

    void speaks() {
        System.out.println("Mammal speaks");
    }
}

class Animal extends Mammal{
    void runs(){
        System.out.println("Animal runs");
    }
}

class Human extends Animal {
    void runs(){
        System.out.println("Human runs");
    }
}

class Cat extends Animal {
    
}