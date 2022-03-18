public class dummy {
    public static void main(String[] args) {
        // int val = 0b101;
        // int[] arr = { 0b10101, 0b11001, 0b10111, 0b101, 0b11, 0b1000, 0b1111, 0b10010
        // };

        // int mask = 1;

        // for (int i = 0; i < 5; i++) {
        // int count =- 0;
        // for (int j = 0; j < arr.length; j++) {
        // if ((mask & arr[j]) != 0) {
        // count++;
        // }
        // }

        // System.out.println(count);
        // mask = (mask << 1);
        // }

        // System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

        // String x = Integer.toBinaryString(Integer.MAX_VALUE);
        // String y = Long.toBinaryString(Integer.MAX_VALUE + 1L);
        // int z = 0b101;
        // System.out.println(x + " " + y + " " + z);

        // yes(new Man());

        Dog d = new Dog();
        // System.out.println(d.age);

    }

    public static void yes(mammals m) {

    }

}

abstract class Animal {
    private int age;

    abstract void play();

    abstract void fight();

    int getAge(){
        return age;
    }
}

abstract class Canine extends Animal {
    void play() {

    }
}

class Dog extends Canine {
    void fight() {

    }

    @Override
    int getAge() {
        return 0;
    }

}

class Man implements mammals {

    @Override
    public void doNothing() {
        // TODO Auto-generated method stub

    }

}

class Woman implements mammals {

    @Override
    public void doNothing() {
        // TODO Auto-generated method stub

    }

}

class Child implements mammals {

    @Override
    public void doNothing() {
    }

    Child() {

    }

    private void do1(int a, int b) {
        System.out.println(a + " " + b);
    }

    private void do1(int a, double b) {

    }

}

interface mammals {
    void doNothing();
}
