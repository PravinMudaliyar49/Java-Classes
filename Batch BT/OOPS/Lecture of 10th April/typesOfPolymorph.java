public class typesOfPolymorph {

}

class Tester3 {
    public static void main(String[] args) {
        IPhone i = new IPhone();
        i.camera(32, "cheez");


    }
}

class Phone {
    void call(){
        System.out.println("Someone calling.");
    }
    
    String camera(int px, String toSay){
        System.out.println("Say " + toSay + " in phone");
        return px + "px";
    }
}

class IPhone extends Phone {
    @Override
    String camera(int px, String toSay) {
        System.out.println("Say " + toSay + " in iphone");
        return px + "px";
    }
}

class Samsung extends Phone {

}
