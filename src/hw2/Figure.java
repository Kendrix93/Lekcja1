// na case ale nie wiem jak to zmieniæ zeby by³o tak jak chce dlatego na if'ach inny program jest 
// a ten taki do treningu 


package hw2;

import java.util.Scanner;

public class Figure {

	private static Scanner scanner;
	private static int a;
	private static int b;
	private static int c;
	private static int d;
	private static int h;
	private static int r;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);

		System.out.println("Welcome user. This is simple program to calculate surface figures. Choose your figure:");
		System.out.println("1. square");
		System.out.println("2. rectangle");
		System.out.println("3. wheel");
		System.out.println("4. triangle");
		System.out.println("or");
		System.out.println("5. result");

		int figure = scanner.nextInt();

		switch (figure) {
		
		case 1:
			System.out.println("You choose square. Enter the value side");
			a = scanner.nextInt();
			return;

		case 2:
			System.out.println("You choose rectangle. Enter the value first side");
			b = scanner.nextInt();
			System.out.println("Enter the second side value");
			c = scanner.nextInt();
			return;
			
		case 3:
			System.out.println("You choose wheele. Enter radius");
			r = scanner.nextInt();
			return;
			
		case 4:
			System.out.println("You choose triagnle. Enter the high");
			h = scanner.nextInt();
			System.out.println("Enter the side value ");
			d = scanner.nextInt();
			return;
			
		case 5:
			break;
				
			
		}
		
		if (a>0){
			System.out.println(a*a);
		}
			
		else{}
		
		
		
	}

}
