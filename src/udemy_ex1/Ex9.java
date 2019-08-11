package udemy_ex1;

import java.util.Scanner;

import util.QuartosEx9;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		QuartosEx9 [] quarto = new QuartosEx9[10];
		char controle = 's';
		
		while (controle != 'n') {
				System.out.println(" ");
				System.out.print("Digite o seu nome: ");
				String nome = sc.nextLine();
				System.out.print("Digite o seu email: ");
				String email= sc.nextLine();
				System.out.print("Digite o numero do quarto: ");
				int nr = sc.nextInt();
				quarto[nr] = new QuartosEx9(nome, email, nr);
				System.out.print("Voce desejar alugar mais um quarto (s/n)");
				controle = sc.next().charAt(0);
				sc.nextLine();
				System.out.println(" ");
		}
		
		for (int i = 0; i < quarto.length; i++) {
			System.out.print(" ");
			System.out.println(quarto[i]);
		}
		sc.close();
	}

}
