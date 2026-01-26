package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

//		switch(expressão) {
//		case 1:
//		break;
//		
//		case 2:
//		break;
//		
//		case 3:
//		break;
//		
//		default:
//
//		}
		
		Scanner scan = new Scanner(System.in);
		
		String menu = """
				Escolha uma das opções:
				1. sacar
				2. depositar
				3. extrato
				""";
		
		System.out.print(menu);
		int opcao = scan.nextInt();
		
		// switch case tradicional
//		switch(opcao) {
//		case 1:
//			System.out.println("Operação de Saque.");
//		break;
//		case 2:
//			System.out.println("Operação de Depósito.");
//		break;
//		case 3:
//			System.out.println("Exibir Extrato.");
//		break;
//		default:
//			System.out.println("Operação inválida.");
//		}
		
		// switch case moderno, usa-se o arrow(flecha) = ->
		// não usa o BREAK
		// Para bloco de código usar { }
		
		switch(opcao) {
		case 1 -> {
			System.out.println("Operação de Saque.");
			System.out.println("Informe o valor para o saque.");
		}
		case 2 -> System.out.println("Operação de Depósito.");
		case 3 -> System.out.println("Exibir Extrato.");
		default -> { 
			System.out.println("Operação inválida.");
			System.out.println("Tente novamente.");
			}
		}
	}

}
