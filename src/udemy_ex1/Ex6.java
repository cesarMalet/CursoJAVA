package udemy_ex1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		
		System.out.println("o fatorial de " + fat);
		sc.close();
	}

}
