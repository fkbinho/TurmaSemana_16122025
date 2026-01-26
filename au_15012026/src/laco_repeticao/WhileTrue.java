package laco_repeticao;

import java.util.Scanner;

public class WhileTrue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite um número ou -1 para sair:");
			int valor = scan.nextInt();
			
			if (valor == -1) {
				System.out.println("Programa encerrado.");
				break;
			} 
			
			if (valor % 2 == 0) {
				System.out.print("par - ");
				System.out.println(valor + " ");
			} 
		}

	}

}
