package laco_repeticao;

import java.util.Scanner;

public class ExercicioCalculadora {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia um número qualquer e mostre a tabuada desse
		 * número, usando a estrutura “for”.
		 */

		/*
		 * 5 x 1 = 5 5 x 2 = 10 5 x 3 = 15 ...
		 */

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Digite um numero:");
			int numero = scan.nextInt();

			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d%n", numero, i, numero * i);
			}

			System.out.println("Deseja continuar:");
			System.out.println("0 para sair");
			System.out.println("1 para continuar");
			int resp = scan.nextInt();

			if (resp == 0) {
				break;
			}
		}

	}

}
