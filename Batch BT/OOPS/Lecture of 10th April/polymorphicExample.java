public class polymorphicExample {

}

class Tester2 {
    public static void main(String[] args) {
        PetOwner p = new PetOwner();
        p.prepareForVaccination();
    }
}

class PetOwner {
    void prepareForVaccination() {
        Dog d = new Dog();
        Cat c = new Cat();
        Cow cow = new Cow();

        Vet v = new Vet();
        v.vaccinate(cow);

        //For donkey:
        Donkey don = new Donkey();
        v.vaccinate(don);
        
        // v.vaccinate(don);


    }
}

class Vet {
    public void vaccinate(Animal a) {
        a.increaseImmune();
    }
    // public void vaccinate(Donkey d) {
    //     d.increaseImmune();
    // }
}

class Animal {
    void increaseImmune() {
        System.out.println("Animal immunity++");
    }
}

class Dog extends Animal {
    @Override
    void increaseImmune() {
        System.out.println("Dog immunity++");
    }
}

class Cat extends Animal {
    @Override
    void increaseImmune() {
        System.out.println("Cat immunity++");
    }
}

class Cow extends Animal {
    @Override
    void increaseImmune() {
        System.out.println("Cow immunity++");
    }
}

class Donkey extends Animal{
    @Override
    void increaseImmune() {
        System.out.println("Donkey immunity++");
    }
}