package JavaFundamentals;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; Вывести числа в порядке возрастания (убывания) значений их длины
 */

public class OptTask0102 {
    public static void main(String[] args) {

        int n = number("введите кол-во чисел");
        int arr[] = new int[n];

        System.out.println("случайные числа от генератора:");
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("сортировка пузырьком по возрастанию");
        boolean sortedInc = false;
        int tempInc;
        while (!sortedInc) {
            sortedInc = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tempInc = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempInc;
                    sortedInc = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("сортировка пузырьком по убыванию");
        boolean sortedDec = false;
        int tempDec;
        while (!sortedDec) {
            sortedDec = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    tempDec = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempDec;
                    sortedDec = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int number(String message) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int data;
        while (!scan.hasNextInt()) {
            scan.hasNext();
            System.out.println("введите корректное число");
        }
        return data = scan.nextInt();
    }
}