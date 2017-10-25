package hw2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	private static Scanner scanner;
	private static int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Liczbo zostala wylosowana Od 1 do 100. Zgadnij jaka. Jesli sie poddajesz napisz liczbe wieksza niz 100");
		
		Random r = new Random();
		
		int a = r.nextInt(100); // niewiadoma 
	//	System.out.println(a);
	//	Integer.toString(a);
		
		System.out.println("Write digit");
		scanner = new Scanner(System.in);
		
		for (int i = 0; i <= 0;) {
			
			int b = scanner.nextInt();  // liczba podawana przez nas 
			
			
			if (b>100){
				System.out.println("Looser. You try only " + counter + " times. " + "Answer was: "+ a);
				i++;
				
			}
			
			else if (b>a) {
					
				System.out.println("Lower");
				b=0;
				counter++;
			}
			else if (b<a){
				
				System.out.println("Higher");
				b=0;
				counter++;
			}
			else if (a==b) {
				counter++;
				System.out.println("Congratulaton. You try only " + counter + " times");
				i++;
			}
			
			
		}
	}

}
