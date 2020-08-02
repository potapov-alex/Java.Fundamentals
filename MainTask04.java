package JavaFundamentals;

import java.util.Scanner;

/**
 * @author potap; Ввести целые числа как аргументы командной строки, подсчитать
 *         их сумму (произведение) и вывести результат на консоль.
 */

public class MainTask04 {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			if (isDigit(args[i])) {
				sum += Integer.valueOf(args[i]);
			}
		}
		System.out.println(sum);

		int comp = 1;
		for (String arg : args) {
			if (isDigit(arg)) {
				comp *= Integer.valueOf(arg);
			}
		}
		System.out.println(comp);

	}
	
	private static boolean isDigit(String s) {  
        @SuppressWarnings("resource")
		Scanner in = new Scanner(s);
        return in.hasNextInt();
    }
}
