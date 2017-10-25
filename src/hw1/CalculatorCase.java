package hw1;

import java.util.Scanner;

public class CalculatorCase {

	// public static int i;

	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.println("Write digits");
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		// int c = scanner.nextInt();

		for (int i = 0; i <= 0; i++) {

			int c = scanner.nextInt();

			switch (c) {

			case 1:
				System.out.println(a + b);
				break;

			case 2:
				System.out.println(a - b);
				break;

			case 3:
				System.out.println(a * b);
				break;

			case 4:
				System.out.println(a / b);
				break;

			default:
				System.out.println("Nie taka liczba g³¹bie");
				return;
				
				

			}

		}

	}
}