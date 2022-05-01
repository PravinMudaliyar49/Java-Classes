import java.util.Arrays;

public class tester {
    public static void main(String[] args) {
        /*
         * IronMan ir = new IronMan();
         * BatMan bm = new BatMan();
         * Thor t = new Thor();
         * 
         * ir.fighting();
         * t.fighting();
         * bm.fighting();
         * ir.plays();
         * t.plays();
         */

        // Mammal m1 = new Mammal();
        // Mammal h1 = new Human(); // Polymorphism.
        // Mammal c1 = new Cat();

        // Not allowed:
        // Human h2 = new Mammal();
        // Mammal mm = new Cat();

        // POLY-MORPHISM ---> Many forms

        // POLYMORPHIC ARRAY:
        Animal[] arr = new Animal[3];

        arr[0] = new Animal();

        arr[1] = new Human();

        arr[2] = new Cat();

        // Not allowed:
        // Mammal m = new Mammal();
        // arr[2] = m;

        for (int i = 0; i < arr.length; i++) {
            arr[i].runs();
        }

        // System.out.println(Arrays.toString(arr));
    }
}
