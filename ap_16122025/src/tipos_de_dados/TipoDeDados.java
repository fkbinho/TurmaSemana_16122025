package tipos_de_dados;

public class TipoDeDados {

	// Método principal - ponto de entrada do programa
	public static void main(String[] args) {
		
		// Declaração de uma variável do tipo String
		// e atribuição de um valor a ela
		// Tipo de dados por referência
		String nome1 = "Kleber";
		
		// Comando para imprimir uma mensagem console
		System.out.println("Bem vindo");
		System.out.print("A Fuctura Tecnologia");
		
		System.out.println("\n" + nome1);
		System.out.println(nome1);
		System.out.println(nome1);
		
		nome1 = "João";
		System.out.println(nome1);
		System.out.println(nome1);
		
		// Tipo de dados primitivos
		
		int numeroNormal = 100000;    
		long numeroGrande = 100000L;   
		double numeroDecimalGrande = 20.99; 
		char caractere = 'A';     
		boolean verdadeiroOuFalso = false;
		
		
		
		// Meu nome é Kleber e tenho 30 anos.
		String nome = "Kleber";
		int idade = 30;
		
		System.out.println("Meu nome é " + nome 
				+ " e tenho " + idade + " anos.");
		
		System.out.printf("Meu nome é %s e tenho %d anos.%n", 
				nome, idade);

		
	}

}
