package alishev.day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(1992, "BMW", "RED");
        car.info();
        System.out.println(car.yeardiff(1950));
    }
}
