package udemy_ex1;

import java.util.ArrayList;
import java.util.Scanner;

import util.FuncEx10;

public class Ex10 {

	public static void main(String[] args) {
		
		ArrayList<FuncEx10> lista = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionarios vc quer cadadastrar: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite a id do funcionario: ");
			int id = sc.nextInt();
			System.out.print("Digite o nome do funcionario: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o salario do funcionario: ");
			double salario = sc.nextDouble();
			lista.add(new FuncEx10( id, nome, salario));
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Listar funcionarios: ");
		for (FuncEx10 obj: lista) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Vc deseja dar um aumento de salaraio para algum funcionario (s/n): ");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.println("digite a porcentagem: ");
			double porcentagem = sc.nextDouble(); 
			
		}
		
	sc.close();
	}

}
