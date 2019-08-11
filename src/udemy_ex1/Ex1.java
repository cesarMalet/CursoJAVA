package udemy_ex1;

public class Ex1 {

	public static void main(String[] args) {
		
		String prod1  = "computador";
		String prod2 = "mesa de trabalho";
		
		int idade = 30;
		int codigo = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos:" );
		System.out.println("computer, which price is $ " + price1 + "\noffice desk, which price is $"+ price2);
		System.out.println("\nRecord: "+ idade + "years old, code "+ codigo + "and gender "+gender );
		System.out.println("\nMauser with eight decimal palces: "+ measure );
		
		System.out.printf("Rouder (three deciamal places): %.2f ", measure);
	}

}
