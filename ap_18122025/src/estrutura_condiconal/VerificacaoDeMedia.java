package estrutura_condiconal;

public class VerificacaoDeMedia {

	public static void main(String[] args) {

		/*
		 * Crie duas notas e faça a média delas.
		 * 
		 * media = (nota1 + nota2) / 2
		 * 
		 * E diga a situação do aluno: - aprovado ( >= 7 ) - recuperação ( >= 4 e < 7 )
		 * - reprovado ( > 0 e < 4 )
		 * 
		 * • Validar se a média é >= 0 e <= 10 • Se o aluno tiver media = 10, aprovado
		 * com excelência
		 */

		double nota1 = 9.8;
		double nota2 = 3.3;
	
		double media = (nota1 + nota2) / 2;

		System.out.println("A média é %.2f" + media);
		
		if (media >= 0 && media <= 10) {
			if (media >= 7) {
				if (media == 10) {
					System.out.println("Aprovado com excelência");
				} else {
					System.out.println("Aprovado!");
				}
			} else if (media >= 4 && media < 7) {
				System.out.println("Recuperação!");
			} else {
				System.out.println("Reprovado!");
			}
		} else {
			System.out.println("Média inválida.");
		}

	}

}
