package estrutura_condiconal;

public class EstruturaIfElse {

	public static void main(String[] args) {
		
		/* Operadores Relacionais 
		 * > Maior que
		 * < Menor que
		 * >= Maior ou igual a
		 * <= Menor ou igual a
		 * == Igual a
		 * != Diferente de
		 * */
		
		/* Opedradores lógicos
		 * || OU
		 * && E
		 * ! Negação (NOT)
		 * */

		/* Estrutura IF 
		 * 
		 * if (condicao) {
		 *   // bloco de codigo
		 * }
		 * 
		 * */
		
		int idade = 80;
		if (idade >= 18 && idade < 65) {
			System.out.println(idade >= 18);
			System.out.print("Voto Obrigatório.");
		} else if (idade >= 16) {
			System.out.println(idade >= 16);
			System.out.print("Voto facultativo.");
		} else {
			System.out.print("Não pode votar.");
		}
		
	}
	
}
