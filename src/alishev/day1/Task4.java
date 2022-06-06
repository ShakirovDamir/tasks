package alishev.day1;

public class Task4 {
    public static void main(String[] args) {
        int age = 29;
        while(age < 100){
            System.out.print(age + " ");
            age += 5;
        }

        System.out.println("");

        for (int i = 29; i < 100; i+=5) {
            System.out.print(i + " ");
        }
    }
}
