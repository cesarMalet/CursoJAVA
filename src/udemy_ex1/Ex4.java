package udemy_ex1;

import java.util.Scanner;

public class Ex4{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com tres numeros: ");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		
		if (v1 > v2 && v1 < v3) {
			System.out.println("o maior valor digitado eh: "+ v1);
		}
		else if(v2 > v1 && v2 > v3 ) {
			System.out.println("o maior valor digitado eh: "+ v2);
		}
		else {
			System.out.println("o maior valor digitado eh: "+ v3);
		}
		
		sc.close();
	}
}