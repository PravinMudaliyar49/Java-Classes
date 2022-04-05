// package Lecture of 4th April;

public class inheritance {
    
}

class Tester{
    public static void main(String[] args) {
        // Animal a = new Animal();
        // a.speaks();
        // a.runs();
        // a.age = 10;

        Ironman ir = new Ironman();
        // ir.kind();
        // ir.useSpecialPower();
        ir.helpful();

        Hulk h = new Hulk();
        h.helpful();

        //Both of them aren't overridden:
        h.useSpecialPower();
        h.useSpecialPower(10);

        // Thor t = new Thor();
        // t.helpful();

    }
}

/* // class Creature{
//     int age;
//     String name;

//     void speaks(){

//     }

//     void runs(){

//     }
// }


// class Animal extends Creature{

// }

// class Human extends Creature{

// } */

class SuperHero{
    // int extraStrength;
    // String suitColor;
    // boolean canFly;

    public void useSpecialPower(){
        System.out.println("Speciality in xyz");
    }

    void helpful(){
        System.out.println("I'm helpful");
    }

    void kind(){
        System.out.println("Alwaysssss...");
    }

}

class Ironman extends SuperHero{
    public void useSpecialPower(){
        System.out.println("I can make things");
    }
}

class Thor extends SuperHero{
    public void useSpecialPower(){
        System.out.println("I can strike lightnings.");
    }

    void helpful(){
        System.out.println("Not interested as of now.");
    }
}

class Hulk extends SuperHero{
    public void useSpecialPower(int age){
        System.out.println("Smashes stuffs");
    }

    // public int useSpecialPower(){
        
    // }
}