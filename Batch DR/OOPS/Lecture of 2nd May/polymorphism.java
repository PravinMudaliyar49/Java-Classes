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

class Animal1 extends Mammal{
    void runs(){
        System.out.println("Animal runs");
    }
}

class Human extends Animal1 {
    void runs(){
        System.out.println("Human runs");
    }
}

class Cat extends Animal1 {
    
}