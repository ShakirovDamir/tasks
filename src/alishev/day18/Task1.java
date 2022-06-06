package alishev.day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1024};
        System.out.println(sum(numbers, 0));
    }

    public static int sum (int[] numbers, int i){
        if(i == numbers.length){
            return 0;
        }
        return numbers[i] + sum (numbers, i + 1);
    }
}
