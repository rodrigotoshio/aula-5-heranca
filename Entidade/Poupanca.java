package Entidade;

public class Poupanca extends Conta {

	public Poupanca(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}

	@Override
	public String toString() {
		return "Poupanca " + mostrar();
	}
	

}
