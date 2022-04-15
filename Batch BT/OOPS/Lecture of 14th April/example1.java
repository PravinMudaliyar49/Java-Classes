import java.util.*;

public class example1 {
}

class Tester{
    public static void main(String[] args) {
        

        int[] arr = {10, 20, 30, 40, 50};
        
        System.out.println(MyArray.toString(arr));
    }
}

class Human{
    @Override
    public String toString() {
        return "Human says hii!";
    }
}

class MyArray{
    public static String toString(int[] arr) {
        String ans = "[";

        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            ans += val;

            if(i != arr.length - 1){
                ans += ", ";
            }
        }

        ans += "]";
        return ans;
    }
}