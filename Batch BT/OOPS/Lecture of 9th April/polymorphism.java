public class polymorphism {
    
}

class tester2{
    public static void main(String[] args) {
        // Human naya = new Mammal();   Not allowed.

        Animal a = new Animal();

        Mammal mammal = new Mammal();
        // Mammal h = new Human();     //Polymorphism

        Human human = new Human();

        // running(mammal);
        running(human);
    }

    public static void running(Mammal m){
        m.runs();
    }

}
