package principal;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("João Silva");
		c1.setAgencia("1234");
		c1.setConta("56789");
		c1.setTitular("João Silva Jr");
	
		System.out.println(c1.getTitular());
		
		System.out.println(c1);

		System.out.println("---------------------");
		
		Conta c2 = new Conta("Tadeu Souza", 100.0);
		System.out.println(c2);
		
		c1.transferir(500.0, c2);
		System.out.println("------Depois------");

		System.out.println(c1);
		System.out.println("---------------------");
		System.out.println(c2);
		System.out.println("\n---------------------\n");

		ContaPoupanca cp1 = new ContaPoupanca("Maria Oliveira", 500.0);
		cp1.depositar(200.0);
		cp1.sacar(100.0);
		System.out.println(cp1);
		
		System.out.println("\n---------------------\n");
		ContaCorrente cc1 = new ContaCorrente("Carlos Pereira", 800.0);
		cc1.sacar(100.0);
		System.out.println(cc1);
		
		
	}

}
