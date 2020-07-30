package JavaFundamentals;

import java.util.Scanner;

/**
 * @author potap; Вывести на консоль те числа, длина которых меньше (больше)
 *         средней длины по всем числам, а также длину.
 */

public class OptTask0103 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("введите набор чисел через пробел");
		String line = sc.nextLine();
		double avg = 0;
		String[] arr = line.split(" ");
		for (String s : arr) {
			avg += s.length();
		}
		if (arr.length > 0)
			avg /= arr.length;
		System.out.printf("Средняя длина введенных чисел: %.2f", avg);
		System.out.println("\nЧисла с длиной больше среднего:");
		for (String s : arr) {
			if (s.length() > avg)
				System.out.println(s + " Длина: " + s.length());
		}
		System.out.println("Числа с длиной меньше среднего:");
		for (String s : arr) {
			if (s.length() < avg)
				System.out.println(s + " Длина: " + s.length());
		}
	}
}
