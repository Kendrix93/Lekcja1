// na case ale nie wiem jak to zmieniæ zeby by³o tak jak chce dlatego na if'ach inny program jest 
// a ten taki do treningu 

package hw2;

import java.util.Scanner;

public class FigureIf {

	private static Scanner scanner;
	private static int a;
	private static int b;
	private static int c;
	private static int d;
	private static int h;
	private static int r;
	private static int x;
	private static int y;
	private static int q;
	private static float result = 0.0f;
	private static double rOut = 0;
	private static double rIn = 0;

	public static boolean figura;
	public static boolean figura2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);

		System.out.println("Welcome user. This is simple program to calculate surface figures. Choose your figure:");

		for (int i = 0; i <= 0;) {

			System.out.println("1. square");
			System.out.println("2. rectangle");
			System.out.println("3. wheel");
			System.out.println("4. triangle");
			System.out.println("5. result");

			int figure = scanner.nextInt();

			if (figure == 1) {
				System.out.println("You choose square. Enter site value");
				a = scanner.nextInt();
				result += a * a;
				if (rOut <= ((Math.sqrt(2) * a) / 2)) {
					rOut = ((Math.sqrt(2) * a) / 2);
					figura = true;
					x = a;
				}
				if (rIn <= a / 2) {
					rIn = a / 2;
					figura2 = true;
					q = a;
				}

			}

			else if (figure == 2) {
				System.out.println("You choose rectangle. Enter smaller side value");
				b = scanner.nextInt();
				System.out.println("Enter second side value");
				c = scanner.nextInt();
				result += b * c;
				if (rOut <= ((Math.sqrt(b * b + c * c)) / 2)) {
					rOut = ((Math.sqrt(b * b + c * c)) / 2);
					figura = false;
					x = b;
					y = c;
				}

			}

			else if (figure == 3) {
				System.out.println("You choose wheele. Enter radius");
				r = scanner.nextInt();
				result += Math.PI * (r ^ 2);
			}

			else if (figure == 4) {
				System.out.println("You choose triagnle. Enter the high");
				h = scanner.nextInt();
				System.out.println("Enter side value ");
				d = scanner.nextInt();
				result += 0.5 * d * h;
			}

			else if (figure == 5) {
				i++;
			} 
			else {
				System.out.println("Wrong number idiot.");
			}

		}

		/*
		 * if (a>0){ System.out.println("Square: " + a*a); } if (b>0 && c>0){
		 * System.out.println("Rectangle: " + b*c); } if (r>0){
		 * System.out.println("Wheele: " + Math.PI*(r^2)); } if (h>0 && d>0){
		 * System.out.println("Triangle: " + 0.5*a*h); }
		 */

		System.out.println("Sum of the areas of geometric figures: " + result);

		if (figura == true) {
			System.out.println("Opisac najlepiej na kwadracie o bokach " + x);
		} 
		
		else if (figura == false) {
			System.out.println("Opisac najlepiej na prostok¹cie o bokach " + x + " i " + y);
		}

		System.out.println("Opisaæ najlepiej w kwadracie o bokach " + q);
		System.out.println(rOut);
		System.out.println(rIn);

	}

}
