package hw1;

import java.util.Scanner;

public class DaysInMonth {

	private static Scanner scanner;
	private static int c;
	int[] d = {1, 2, 3, 4 };

	public static void main(String[] args) {


		// public int a;
		// public int b;

		System.out.println("Podaj miesiac jako cyfre");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		System.out.println("Podaj Rok");
		int b = scanner.nextInt();

		//int x = b % 400;
		int y = (b / 100)%4;
		int z = b % 4;
		
		if (a==1|a==3|a==5|a==7|a==8|a==10|a==12){
			c = 31;	
		}

		else if (y==0 && z==0 && a==2) {
			 c = 29;
		}
		else if (a==2) {
			c=28;
		}
		else {
			c=30;
		}

		System.out.println(c);

	}

}
