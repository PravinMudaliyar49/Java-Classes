public class tester {
    public static void main(String[] args) {
        // Animal[] aniarr = new Animal[4];

        // aniarr[0] = new Human();

        // aniarr[1] = new Cat();

        // for (int i = 0; i < 2; i++) {
        // aniarr[i].runs();
        // }

        // Animal animal = new Animal();
        // doThings(animal);

        // Human human = new Human();
        // doThings(human);

        // Not allowed:
        // Dummy d = new Dummy();
        // doThings(d);

    }

    public static void doThings(Animal1 a) {
        // a.runs();
    }

    public static Animal1 returnThis() {
        Animal1 a = new Animal1();

        Human h = new Human();

        Mammal m = new Mammal();

        // return m; Not allowed
        return h; // Polymorphism
        // return a; Normally.
    }

}

class Dummy {

}