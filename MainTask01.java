package JavaFundamentals;

import java.util.Scanner;

/**
 * @author potap; Приветствовать любого пользователя при вводе его имени через
 *         командную строку.
 */

public class MainTask01 {

	public static void main(String[] args) {

		System.out.println("скажи мне как тебя зовут?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Привет, " + name + "!");
	}
}