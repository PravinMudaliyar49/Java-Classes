public class overloading {

}

class Tree {
    void giveProduct(String val, int num) {
        System.out.println("Trees produces things.");
    }

    void giveProduct(int number) {
        System.out.println("Trees produces " + number + " things.");
    }

    int giveProduct(int number, String str) {
        return 0;
    }
}

class MangoTree extends Tree {
    void giveProduct() {
        System.out.println("Mango is produced.");
    }
}

class BanyanTree extends Tree {

}
