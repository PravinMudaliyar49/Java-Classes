public class tester{
    public static void main(String[] args) {
        // Human h1 = new Human();
        // h1.age = 10;
        // h1.name = "Random";
        
        // Human h2 = new Human();
        // h2.age = 15;
        // h2.name = "Justt";

        // Human h3 = h1;
        
        // h1.giveIntro();
        // h2.giveIntro();
        // h3.giveIntro();

        // Human h4 = new Human();
        // h4.speaks("Gibberish");

    }
}



class Human{
    int age;
    String name;
    
    void giveIntro(){
        System.out.println("My name is " + name + " and my age is " + age + ".");
    }

    void speaks(String words){
        System.out.println("I speak " + words);
    }

}

class Child{
    int age;
    String name;
}