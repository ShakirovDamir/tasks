package dmdev.level2.oop.lesson1_4;

public class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load(){
        System.out.println("Я загрузился");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ssd=" + ssd +
                ", ram=" + ram +
                '}';
    }
}
