package alishev.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

            String city = scanner.nextLine();

            if(city.equals("Stop")){
                break;
            }
            switch (city){
                case "Moscow":
                case "Ufa":
                    System.out.println("Russia");
                    break;

                case "London":
                case "Manchester":
                    System.out.println("Great Britain");
                    break;

                default:
                    System.out.println("unknown country");
            }

        }
    }
}
