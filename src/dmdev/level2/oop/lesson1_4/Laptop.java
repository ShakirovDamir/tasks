package dmdev.level2.oop.lesson1_4;

public class Laptop extends Computer{

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;

    }

    public void open(){
        System.out.println("Я открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
