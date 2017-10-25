package hw2;

import java.util.Scanner;

public class BooleanNauka {
	

	private static Scanner scanner;
	private static int a;
	public static boolean figura;
	static String s1 = "false";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanner = new Scanner(System.in);
		a = scanner.nextInt();
		
		

		if (a == 1){
			figura=true;	
		}
		else if (a==2)
		{
			figura=false;
			System.out.println(figura);
		}
		
		System.out.println(figura);
		
		if (figura == false){
			System.out.println(figura + "false" + a);
		}
		else if (figura == true){
			System.out.println(figura + "true" + a);
		}
		
		System.out.println(figura + "xxx");

	}


	

	
}



