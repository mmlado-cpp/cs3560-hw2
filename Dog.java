package HW2;
import java.util.ArrayList;
//5d
import java.util.List;

public class Dog {
    private String breed;
    private String name;
    private List<Paw> paws = new ArrayList<>(4);
    public Dog() {
        for (int i = 0; i < 4; i++) {
            this.paws.add(null); //dog must have 4 paws
        }
        
    }
}

class Paw {
    private int position;
    private Dog dog;
    public Paw(int position, Dog dog) {
        this.position = position;
        this.dog = dog;
    }
}
