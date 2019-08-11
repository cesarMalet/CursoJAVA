package util;

public class FuncEx10 {

	private int id;
	private String nome;
	private double salario;
	
	public FuncEx10() {
	}
	
	public FuncEx10(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void incrSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}

	public String toString(){
		return "\n id:  " + id +
				"\n nome: " + nome+
				"\nsalario: " + String.format("%.2f", salario) ;
	}
}
