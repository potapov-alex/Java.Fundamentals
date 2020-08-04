package JavaFundamentals;
import java.util.Scanner;

/**
 * @author potap; Найти самое короткое и самое длинное число. Вывести найденные
 *         числа и их длину.
 */

public class OptTask0101 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("введите набор чисел через пробел");
		String line = scan.nextLine();
		String longWord = "", shortWord = line;
		for (String s : line.split(" ")) {
			if (s.length() > longWord.length())
				longWord = s;
			if (s.length() < shortWord.length())
				shortWord = s;
		}
		System.out.println("Самое длинное слово: '" + longWord + "'");
		System.out.println("Длина: " + longWord.length());
		System.out.println("Самое короткое слово: '" + shortWord + "'");
		System.out.println("Длина: " + shortWord.length());
	}
}