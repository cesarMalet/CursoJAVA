package util;

public class QuartosEx9 {

	public String nome;
	public String email;
	public int nrQuarto;
	
	public QuartosEx9(String nome, String email, int nrQuarto) {
		this.nome = nome;
		this.email = email;
		this.nrQuarto = nrQuarto;
	}
	
	
	public String toString() {
		return "\nNome do Locador: " 
				+ nome + 
				"\nemail: " 
				+ email + 
				"\nnº do quarto: "
				+ nrQuarto;
	}
	
}
