
public class encapsulation {
    public static void main(String[] args) {
        Animal animal = new Animal();

        // animal.weight = -1;
        // System.out.println(animal.weight);

        // animal.setWeight(20);
        // System.out.println(animal.getWeight());
        

    }
}

class Animal {
    private int weight;

    public void setWeight(int weightInput) {
        if(weightInput > 0){
            weight = weightInput;
        }
    }

    public int getWeight() {
        return weight;
    }

}