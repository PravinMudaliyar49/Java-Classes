public class inheritance {

}

class Animal {
    String walking;
    int age;
    boolean shouts;
    boolean barks;

    int dummy = 1000;

    void walks(int walkingSpeed) {
        System.out.println("The animal walks with " + walkingSpeed + " speed.");
    }
}

class Cat {
    String walking;
    int age;
    boolean shouts;
    boolean barks;

    void walks(int walkingSpeed) {
        System.out.println("The animal walks with " + walkingSpeed + " speed.");
    }
}

class Cow extends Animal {

}

class Lion {
    int number = 1000;

    void dummy() {
        System.out.println(number);
    }
}

class Tiger extends Lion {
    int number = 2000;

    void dum() {
        System.out.println(number);
    }
}

class Liger extends Tiger {

}

// Interface.
// Activities of each class are different, how will the wrapper class handle
// that --> By overriding.
