package udemy_ex1;

import java.util.Scanner;

import util.Cliente;


public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		
		System.out.print("insira o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("digite o nome do usuario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("tem deposito inicial (s/n): ");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.print("entre com o valor do deposito: ");
			double depInicial = sc.nextDouble();
			cliente = new Cliente(conta, nome, depInicial);
		}
		else {
			cliente = new Cliente(conta, nome);
		}
		
				
		System.out.println();
		System.out.println(cliente);
		
		System.out.println();
		System.out.print("digite um valor para deposito: ");
		double depostio = sc.nextDouble();
		cliente.depositar(depostio);
		
		System.out.println();
		System.out.println(cliente);
		
		System.out.println();
		System.out.print("digite um valor para deposito: ");
		double saque = sc.nextDouble();
		cliente.sacar(saque);
		
		System.out.println();
		System.out.println(cliente);
		
		
		
	sc.close();
	}

}
