public class stateBehavior {

}

class Child {
    int age;
    String name = "Dhruv";

    void giveAge(int val) {
        System.out.println(age);
        // age = val;
    }

    String giveName() {
        if (name == "Random") {
            return "Great";
        } else if (name == "Rushi") {
            return "1";
        } else if (name == "Dhruv") {
            return "10";
        } else {
            return "Yes";
        }
    }

    void dummy(){
        int count = 10;

        System.out.println(count);
        
    }

}
