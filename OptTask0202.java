package by.learn.java.fundamentals;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; Найти и вывести наибольшее число возрастающих (убывающих)
 *         элементов матрицы, идущих подряд.
 */

public class OptTask0202 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер матрицы");
		int size = sc.nextInt();
		int arr[][] = new int[size][size];
		fillRandom(arr, size);
		printArr(arr);
		System.out.println();
		inDecrease(arr);
	}

	public static void fillRandom(int a[][], int d) {
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[j][i] = random.nextInt(2 * d + 1);
			}
		}
	}

	public static void printArr(int[][] a) {

		for (int[] x : a) {
			for (int z : x) {
				System.out.print(z + "  ");
			}
			System.out.println();
		}
	}

	public static void inDecrease(int[][] b) {
		int[] f = new int[b.length * b.length];
		int c = 0;
		int r = 0;
		int max = 0;
		int h = 0;
		int m = 0;
		int min = 0;
		int h1 = 0;
		for (int[] x : b) {
			for (int z : x) {
				f[c++] = z;
			}
		}
		for (int g = 0; g < f.length - 1; g++) {
			if (f[g] < f[g + 1]) {
				r += 1;
				if (r > max) {
					max = r;
					h = g + 1;
				}
			} else {
				r = 0;
			}
			if (f[g] > f[g + 1]) {
				m += 1;
				if (m > min) {
					min = m;
					h1 = g + 1;
				}
			} else {
				m = 0;
			}
		}
		System.out.println("Максимальная последовательность возрастающих чисел:");
		int[] l = new int[max + 1];
		System.arraycopy(f, (h - max), l, 0, (max + 1));
		System.out.println(Arrays.toString(l) + " " + (max + 1));
		System.out.println("Максимальная последовательность убывающих чисел:");
		int[] t = new int[min + 1];
		System.arraycopy(f, (h1 - min), t, 0, (min + 1));
		System.out.println(Arrays.toString(t) + " " + (min + 1));
	}
}