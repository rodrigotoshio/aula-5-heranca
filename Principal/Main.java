package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidade.Conta;
import Entidade.Corrente;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bem-Vindo ao Banco do Seduc 1! ");
		
		Scanner sc = new Scanner(System.in);
		List<Conta> lista = new ArrayList<Conta>();
		System.out.println("Quantas contas você deseja cadastrar: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			System.out.println(" Digite C para Conta Corrente ou P para poupança: ");
			String x = sc.next();
			if(x.equals(" C ")) {
				
			}
			System.out.println(" Digite o nome do dono da conta: " + i);
			String nome = sc.next();
			
			System.out.println(" Digite o numero da sua conta: ");
			int numero = sc.nextInt();
		
			System.out.println(" Digite o saldo: ");
			double saldo = sc.nextDouble();
			
			System.out.println(" Digite o limite: ");
			double limite = sc.nextDouble();
			
			Conta conta = new Corrente(nome, numero, saldo, limite);
			
			Conta P = new Corrente(nome, numero, saldo, limite);
			lista.add(conta);
		}	
		System.out.println(lista);
	}
}