package by.learn.java.fundamentals;

/**
 * @author potap; Отобразить в окне консоли аргументы командной строки в
 *         обратном порядке.
 */

public class MainTask02 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.println("Aрг-> " + args[i]);
	}
}