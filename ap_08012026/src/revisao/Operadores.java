package revisao;

public class Operadores {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		// Operadores Aritméticos
		/*  + - soma
			- - subtração
			/ - divisão
			* - multiplicação
			% - módulo (resto da divisão)
		*/
		
		// () - prioridade

		int soma = num1 + num2;
		System.out.println("Valor da soma: " + soma);
		
		int resto = num1 % num2;
		System.out.println("Valor do resto: " + resto);
		
						// casting - conversão de tipos
		double media = ((double) num1 + num2) / 2;
		
		System.out.println("Média: " + media);
	}

}




