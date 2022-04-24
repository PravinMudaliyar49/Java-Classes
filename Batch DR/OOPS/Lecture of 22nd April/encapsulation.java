public class encapsulation {

}

class Cat {
    private String name;
    private int height = 10;
    private int size = 10;

    int showHeight() {
        return height;
    }

    void setHeight(int input) {
        if (input > 0) {
            height = input;
        }
    }

    public void setName(String input) {
        name = input;
    }

    public String getName() {
        return name;
    }

    //Don't do this:
    
    // public void setter(int ipheight, String ipName, int ipsize){
    //     height = ipheight;
    //     name = ipName;
    //     size = ipsize;
    // }

}
