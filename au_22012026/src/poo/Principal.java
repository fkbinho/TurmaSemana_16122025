package poo;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciando um objeto (criando)
		Carro c1 = new Carro();
		c1.marca = "Fiat";
		c1.modelo = "Uno";
		c1.ano = 2026;
		
		c1.ligar();
		
		Carro c2 = new Carro();
		c2.marca = "Mercedes";
		c2.modelo = "Onibus";
		c2.ano = 2026;
		
		c2.ligar();

		System.out.println(c1.marca);
		System.out.println(c2.marca);
		
		System.out.println("Informações do carro:");
		System.out.println(c1.toString());
		
		
	
		
	}

}
