package alishev.day7;


public class Task1 {
    public static void main(String[] args) {

        Airplane boing1 = new Airplane("Boing", 2016, 75, 2500 );
        Airplane boing2 = new Airplane("Boing", 2016, 50, 2500 );

        Airplane.compareAirplanes(boing1, boing2);
    }
}
