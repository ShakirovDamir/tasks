package alishev.day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        int max = 0;
        for(int element : array){
            if(element > max){
                max = element;
            }
        }
        System.out.println("Максимальный элемент в массиве: " + max);

        int min = max;
        for(int element : array){
            if(element < min){
                min = element;
            }
        }
        System.out.println("Минимальный элемент в массиве: " + min);

        int counter = 0;
        for(int element : array){
            if(element % 10 ==0){
                counter++;
            }

        }
        System.out.println("Количество элементов оканчивающихся на 0" + counter);

        int sum = 0;
        for(int element : array){
            if(element % 10 ==0){
                sum += element;
            }

        }
        System.out.println("Сумма элементов оканчивающихся на 0" + sum);
    }
}
