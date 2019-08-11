package udemy_ex1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a senha: ");
		int senha =  sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("senha INVALDA!\n ");
			System.out.print("digite a senha: ");
			senha =  sc.nextInt();
			
			
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
