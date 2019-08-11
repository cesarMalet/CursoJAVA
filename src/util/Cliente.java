package util;

public class Cliente {
	
	private int conta;
	private String nome;
	private double saldo;
	
	
	
	public Cliente(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public Cliente(int conta, String nome, double depInicial) {
		this.conta = conta;
		this.nome = nome;
		depositar(depInicial);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public double depositar(double valor) {
		return saldo += valor; 
	}
	
	public double sacar(double valor) {
		return saldo -= valor + 0.5;
	}
	
	public String toString() {
		return "Conta: " + conta + "\tnome: "+ nome + "\tSaldo: " + String.format("%.2f", saldo);
	}
	
}
