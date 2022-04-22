public class shadowing {
    int x = 100;

    public void m1(){
        int x = 1000;
        // System.out.println(x);

        m2(x);
    }

    public void m2(int x){
        System.out.println(x);
    }

}
