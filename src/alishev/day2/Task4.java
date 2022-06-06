package alishev.day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;

        if(x <= 5){
            y = Math.abs(x);
        } else if(x >= 6 && x <= 10){
            y = Math.pow(2, x);
        } else {
            System.out.println("Hello Math");
        }
        System.out.println(y);
    }
}
