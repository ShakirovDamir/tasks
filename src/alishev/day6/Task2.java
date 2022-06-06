package alishev.day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane boing = new Airplane("Boing", 2016, 25, 2500 );
        boing.info();
        boing.fillUp(200);
        boing.fillUp(300);
        boing.setYear(2018);
        boing.info();

    }
}
