package HW2;
//5d
import java.util.List;

public class Dog {
    private String breed;
    private String name;
    private List<Paw> paws;
    public Dog() {
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
