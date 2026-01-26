package revisao;

import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String[] args) {
		
//		if(condicao) {
//			
//			if () {
//				
//			} else if () {
//				
//			}
//			
//		} else if(condicao2) {
//			
//		} else if(condicao3) {
//			
//		} else {
		
//	    }
		
		
		/* Desenvolva um conversor que recebe uma 
		 * unidade de medida (metro, centímetro, quilômetro) 
		 * e converte para outra unidade com base na entrada.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a unidade de medida:");
		System.out.println("1. cm");
		System.out.println("2. m");
		System.out.println("3. km");
		int opcaoEntrada = scan.nextInt();
		
		if (opcaoEntrada < 1 || opcaoEntrada > 3) {
			System.out.println("Opção inválida.");
		} else {
			System.out.println("Qual a unidade de medida "
					+ "em que deseja converter:");
			
			if (opcaoEntrada == 1) {
				System.out.println("1. m");
				System.out.println("2. km");
			} else if(opcaoEntrada == 2) {
				System.out.println("1. cm");
				System.out.println("2. km");
			} else {
				System.out.println("1. cm");
				System.out.println("2. m");
			}
			int opcaoSaida = scan.nextInt();
			
			if (opcaoSaida > 2 || opcaoSaida < 1) {
				System.out.println("Opção inválida.");
			} else {
				System.out.println("Insira o valor a ser convertido:");
				double valor = scan.nextDouble();
				
				double resultado = 0;
				
				// verifcar as opção de entrada == cm
				if(opcaoEntrada == 1) {
					// verifcar as opção de saida == m
					if (opcaoSaida == 1) {
						resultado = valor / 100; // cm -> m
					} 
					// verifcar as opção de saida == km
					else {
						resultado = valor / 100000; // cm -> km
					}
				}
				
				// verifcar as opção de entrada == m
				if(opcaoEntrada == 2) {
					// verifcar as opção de saida == cm
					if (opcaoSaida == 1) {
						resultado = valor * 100; // m -> cm
					} 
					// verifcar as opção de saida == km
					else {
						resultado = valor / 1000; // m -> km
					}
				}
				
				// verifcar as opção de entrada == km
				if(opcaoEntrada == 3) {
					// verifcar as opção de saida == cm
					if (opcaoSaida == 1) {
						resultado = valor * 100000; // km -> cm
					} 
					// verifcar as opção de saida == m
					else {
						resultado = valor * 1000; // km -> m
					}
				}
				
				System.out.printf("Valor inicial: %.2f%n", valor);
				System.out.printf("Valor convertido: %f%n", resultado);
				
			}
		}
		
		System.out.println("Programa encerrado!");
	

	}

}
