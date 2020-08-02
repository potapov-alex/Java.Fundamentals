package JavaFundamentals;
import java.util.Scanner;

/**
 * @author potap; Ввести число от 1 до 12. Вывести на консоль название месяца,
 *         соответствующего данному числу. Осуществить проверку корректности
 *         ввода чисел.
 */

public class MainTask05 {
	public static void main(String[] args) {

		int a = setMonth("Введите номер месяца");
		String[] month = { "январь", "феваль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь",
				"ноябрь", "декабрь" };
		String s;
		try {
			s = month[a - 1];
			System.out.println("Это месяц - " + s + ".");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Такого месяца не существует");
		}
	}

	private static int setMonth(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.hasNext();
			System.out.println("введите корректное число");
		}
		int month = sc.nextInt();
		return month;
	}
}