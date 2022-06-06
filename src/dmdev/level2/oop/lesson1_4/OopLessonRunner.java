package dmdev.level2.oop.lesson1_4;

public class OopLessonRunner {
    public static void main(String[] args) {

        Ssd ssd = new Ssd(1024);
        Ram ram = new Ram(500);
        Computer computer = new Computer(ssd, ram);
        computer.load();
        System.out.println(computer);
        double pow = Math.pow(2, 3);
        System.out.println(pow);

        Laptop laptop = new Laptop(new Ssd(250), new Ram(512), 5);
        laptop.open();
        laptop.load();
    }
}
