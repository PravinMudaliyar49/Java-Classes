public class encapsulation {

}

class Cat {
    String name;
    private int height = 10;
    private int size = 10;

    int showHeight() {
        return height;
    }

    void setHeight(int input) {
        if(input > 0){
            height = input;
        }
    }
}
