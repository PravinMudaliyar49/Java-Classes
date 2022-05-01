public class inheritance {

}

class SuperHero {
    boolean kindness = true;
    String colorSuits = "Black";

    void fighting() {
        System.out.println("Hero fights well with enemies.");
    }

    void specialPower() {
        System.out.println("Hero has special powers");
    }

}

class DCUniverse extends SuperHero {

}

class Marvel extends SuperHero {

    void fighting() {
        System.out.println("Fights slowly.");
    }

    void impressFans() {
        System.out.println("Heroes always impresses fans.");
    }
}

class IronMan extends Marvel {
    boolean kindness = false;

    void plays() {
        fighting();         //What will be called? Parent's fighting ot IronMan's fighting?
    }

    //This is not ovverriding.
    void fighting(String weapon) {
        System.out.println("Fights with " + weapon);
    }
}

class Thor extends Marvel {
    void plays() {
        fighting();         //What will be called? Parent's fighting ot Thor's fighting?
    }

    //This is ovverriding.
    void fighting() {
        System.out.println("Fights superspeed.");
    }
}

class BatMan extends DCUniverse {

}
