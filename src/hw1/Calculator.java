package hw1;

import java.util.Scanner;

public class Calculator {


	private static Scanner scanner;
	public static int d;

	public static void main(String[] args) {

		System.out.println("Write digits");
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		for (int i = 0; i <= 0;) {

			int c = scanner.nextInt();

			if (c == 1) {
				d = a + b;
				System.out.println(d);
				i++;
			}

			else if (c == 2) {
				d = a - b;
				System.out.println(d);
				i++;
			}

			else if (c == 3) {
				d = a * b;
				System.out.println(d);
				i++;

			}

			else if (c == 4) {
				d = a / b;
				System.out.println(d);
				i++;
			}

			else {
				System.out.println("Nie taka liczba g³¹bie");

			}

		}
		int e = scanner.nextInt();

		for (int i = 0; i <= 0;) {

			int f = scanner.nextInt();

			if (f == 1) {
				int g = d + e;
				System.out.println(g);
				i++;
			}

			else if (f == 2) {
				int g = d - e;
				System.out.println(g);
				i++;
			}

			else if (f == 3) {
				int g = d * e;
				System.out.println(g);
				i++;

			}

			else if (f == 4) {
				int g = d / e;
				System.out.println(g);
				i++;
			}

			else {
				System.out.println("Nie taka liczba g³¹bie");

			}

		}

	}
}
