package revisao;

public class EstruturaCondicional {

	public static void main(String[] args) {
		// Operadores Relacionais
		/* 
			==  igual a
			!=  diferente de
			>   maior que
			<   menor que
			>=  maior ou igual a
			<=  menor ou igual a
		*/
		// Operadores Lógicos
		/*
			&& -  e  ( todas as condições devem ser verdadeiras )
			|| -  ou
			!  - não (not)
		*/
		
		// Estrutura condicional
		/* if (condição) {
			// bloco de código a ser executado se a condição for verdadeira
		   } 
		*/
		double nota1 = 3;
		double nota2 = 3;
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		} else if(media < 4) {
			System.out.println("Aluno reprovado!");
		} else {
			System.out.println("Aluno em recuperação!");
		}
		
		
	}

}
