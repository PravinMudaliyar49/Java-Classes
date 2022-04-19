public class passByValue {

}

class Human{
    void takes(Animal a){
        System.out.println(a);
        a.age++;
    }

    void gives(int val){

    }
}

class Animal{
    int age;
    int months;
}
