import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;

// package Lecture of 3rd April;

public class pass {

}

class Tester {
    static int age = 20;

    public static void main(String[] args) {

        // int age = 30;

        // make(40);
        // System.out.println(age);

        // int dummy = 10;
        // change(dummy);
        // System.out.println(dummy);

        // Animal a = new Animal();
        // a.age = 10;
        // change(a);
        // System.out.println(a.age);

        // Animal[] arr = new Animal[3];
        // // arr[0] = 1;

        // //NON-PRIMITIVE ARRAY:

        // Animal a = new Animal();
        // a.age = 10;
        // a.speak = "bark";

        // arr[0] = a;

        // arr[1] = new Animal();
        // arr[1].age = 20;
        // arr[1].speak = "roar";

        // System.out.println(Arrays.toString(arr));

        // int a = 10;
        // int b = 10;

        // System.out.println(a == b); //True

        // Animal a = new Animal();
        // Animal b = new Animal();
        // Animal c = a;

        // System.out.println(a == b);
        // System.out.println(a == c);
        // System.out.println(b == c);

        // byte b = 8;
        // int i = 8;

        // System.out.println(b == i);

        Animal a = new Animal();

        // Can't do read or write:
        // a.age = -1;
        // System.out.println(a.age);

        a.setAge(10);
        System.out.println(a.getAge());

    }

    // static void change(int val) {
    // val = val + 90;
    // }

    // static void change(Animal b) {
    // b.age = b.age + 90;
    // }

    // Shadowing:
    // static void make(int age) {
    // System.out.println(age);
    // }
}

class Animal {
    private int age;
    private String name;

    public void setAge(int ipage) {
        age = ipage;
    }

    public int getAge() {
        return age;
    }

    public void setName(String ipname) {
        name = ipname;
    }

    public String getName() {
        return name;
    }

}