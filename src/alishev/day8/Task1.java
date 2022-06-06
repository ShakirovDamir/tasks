package alishev.day8;

public class Task1 {
    public static void main(String[] args) {

        String numbers = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            numbers += i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println("Время String: " + (after - before));


        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            sb.append(i).append(" ");
        }
        after = System.currentTimeMillis();
        System.out.println("Время StringBuilder: " + (after - before));
    }
}
