package operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		/* Comentário em bloco */
		// Operadores Aritméticos
		
		/*
		 + Adição
		 - Subtração
		 * Multiplicação
		 / Divisão
		 % Módulo (Resto da divisão)
		*/
		
		int numero = 10;
		int numero2 = 3;
		System.out.println("Valor 1: " + numero);
		System.out.println("Valor 2: " + numero2);
		
		int soma = numero + numero2;
		System.out.println("Soma: " + soma);
		
		int subtracao = numero - numero2;
		System.out.println("Subtração: " + subtracao);
		
		int multiplicacao = numero * numero2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		double divisao = (double) numero / numero2;
		System.out.println("Divisão: " + divisao);
		
		int modulo = numero % numero2;
		System.out.println("Módulo: " + modulo);
		
		System.out.printf("Divisão c/ casas decimais: %.2f", divisao);
	}
	
}







