package udemy_ex1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre your full name: ");
		String name = sc.nextLine();	
		System.out.println("How many bedrooms are there in your house?");
		int inteiro = sc.nextInt();
		System.out.println("Entre product price: ");
		double decimal = sc.nextDouble();
		System.out.println("Entre your last anme, age and height (same line");
		String name1 = sc.next();
		int inteiro2 = sc.nextInt();
		double decimal2 = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(inteiro);
		System.out.println(decimal);
		System.out.println(name1);
		System.out.println(inteiro2);
		System.out.println(decimal2);
	
		
	}

}
