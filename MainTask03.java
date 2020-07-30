package JavaFundamentals;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; Вывести заданное количество случайных чисел с переходом и без
 *         перехода на новую строку
 */

public class MainTask03 {

	public static void main(String[] args) {

		System.out.println("ведите кол-во случайных чисел");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int arr[] = new int[k];

		for (int i = 0; i < arr.length; i++) {
			Random rnd = new Random();
			arr[i] = rnd.nextInt(100);

		}

		System.out.println(k + " случайных чисел без перехода на новую строку");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(k + " случайных чисел с переходом на новую строку");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}