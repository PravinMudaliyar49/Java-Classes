public class veternary {
    public static void main(String[] args) {
        PetOwner po = new PetOwner();
        po.sendForVaccination();
    }
}

// Statement: Create a veternary vaccination program, where PetOwner will carry
// the pets to the Vet-Doctor for vaccination.

class Animal {
    public void doseCompleted() {
        System.out.println("Animal got more immune."); // Proof.
    }
}

class Dog extends Animal {
    public void doseCompleted() {
        System.out.println("Dog got more immune.");
    }
}

class Cow extends Animal {
    public void doseCompleted() {
        System.out.println("Cow got more immune.");
    }
}

class Horse extends Animal {
    public void doseCompleted() {
        System.out.println("Horse got more immune.");
    }
}

class Donkey extends Animal {

}

class PetOwner {
    public void sendForVaccination() {

        Horse horse = new Horse();
        Dog dog = new Dog();
        // Cow c = new Cow();
        
        Vet doctor = new Vet();
        
        doctor.vaccinatePet(horse);
        // doctor.vaccinatePet(dog);

        Donkey donkey = new Donkey();
        doctor.vaccinatePet(donkey);
    }
}

class Vet {
    public void vaccinatePet(Animal a) {
        a.doseCompleted();
    }
}

// RepairShop. 