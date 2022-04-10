// package Lecture of 10th April;

public class polymorphism {

}

class Tester {
    public static void main(String[] args) {
        // Mammals m = new Human(); //First use.

        // Human h = new Human();
        // Mammals m = new Mammals();

        // speakWell(h);
        // speakWell(m);

        // Mammals[] marr = new Mammals[5];

        // marr[0] = s;
        // marr[1] = a;
        // marr[2] = c;

        // Mammals m1 = new Mammals();
        // Mammals m2 = new Mammals();
        // Mammals m3 = new Mammals();

        // marr[0] = m1;
        // marr[1] = m2;
        // marr[2] = m3;

        // Mammals get1 = marr[0];
        // get1.age = 10;

        // System.out.println(m1.age);
        // System.out.println(get1.age);

        Mammals[] marr = new Mammals[5];
        marr[4] = new Rabbit();
        marr[1] = new Reptile();
        marr[2] = new Human();
        marr[3] = new Dog();
        marr[0] = new Mammals();

        // for (int i = 0; i < marr.length; i++) {
        // marr[i].speaks();
        // }

        // double[] d = new double[2];
        // int i = 10;
        // d[0] = i;

        // char c = 'a';
        // d[1] = c;

        // Mammals r = new Reptile();
        // r.speakFast();

        Reptile r = new Reptile();
        r.speakFast();
        r.speaks();

    }

    public static void speakWell(Mammals m) {
        System.out.println("New speak");
        m.speaks();
    }

    public static Mammals returnBetter() {
        Mammals m = new Mammals();

        Human h = new Human();
        return h;
    }

}

class Mammals {
    int age;

    void speaks() {
        System.out.println("Mammal speaks");
    }
}

class Human extends Mammals {
    @Override
    void speaks() {
        System.out.println("Human speaks");
    }
}

class Dog extends Mammals {
    @Override
    void speaks() {
        System.out.println("Dog speaks");
    }
}

class Reptile extends Mammals {
    void speakFast() {
        System.out.println("Reptile speaks fastly.");
    }
}

class Rabbit extends Mammals {
    @Override
    void speaks() {
        System.out.println("Rabbit speaks");
    }
}