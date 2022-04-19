public class tester {
    public static void main(String[] args) {
        /*
         * Human h = new Human();
         * Animal a = new Animal();
         * 
         * System.out.println(a);
         * 
         * a.age = 20;
         * a.months = 10;
         * h.takes(a);
         * 
         * System.out.println(a.age);
         */

        // int[] arr1 = new int[3];
        // arr1[0] = 10;

        // String[] arr3 = new String[3];
        // System.out.println(arr3[0]);

        // Parent x = null;
        // String y = null;

        // System.out.println(x + " " + y);

        Parent[] arr2 = new Parent[3];

        /* Not allowed:
        arr2[0] = 10;
        arr2[1] = "7";
        arr2[2] = 'a'; 
        Child y = new Child();
        arr2[1] = y;
        */

        // Parent x = new Parent();

        // x = 7; ...........Not allowed
        
        // arr2[0] = x;

        // System.out.println(x);
        // System.out.println(arr2[0]);

        Human1[] arr = new Human1[5];

        Human1 h1 = new Human1();
        // h1.age = 10;

        arr[0] = h1;
        
        arr[1] = h1;

        arr[2] = h1;

        arr[3] = h1;

        arr[3].age = 100;

        arr[3].name = "Random";

        arr[4].name = "Pravin";

        // System.out.println(arr[0].age + " " + arr[0].name);
        System.out.println(arr[4].age + " " + arr[4].name);
        
    }
}