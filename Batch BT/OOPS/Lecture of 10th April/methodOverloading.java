public class methodOverloading {
    
}

class Tester4{
    public static void main(String[] args) {
        Maths m = new Maths();
        m.add(1, 2);
        m.add(3, 4);
        // m.add(1, 2, 3);
        // m.add(1, 2, 3, 4);
    }
}

class Maths{
    // int add(int a, int b){
    //     return a + b;
    // }

    // int add(int a, int b, int c){
    //     return a + b + c;
    // }

    // int subtract(int a, int b){
    //     return b - a;
    // }

    // int subtract(String a, int b){
    //     return Integer.parseInt(a) - b;
    // }

    //Not an overload:
    // int add(int a, int b){
    //     return a + b;
    // }

    // int add(int a, int b){
    //     return a + b;
    // }

    int add(int a, int b){
        return a + b;
    }

    // int add(int c, int d){
    //     return c + d;
    // }
}
