package udemy_ex1;

import java.util.Scanner;

import util.Conversao;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qual o valor do dorlar: ");
		double dolar = sc.nextDouble();
		
		System.out.println("quantos dolar vc vai comprar: ");
		double qtd = sc.nextDouble();
		
		
		System.out.printf("o em reais mais IOF é de: %.2f", Conversao.resultado(dolar, qtd) );
		
		sc.close();
	}

}
