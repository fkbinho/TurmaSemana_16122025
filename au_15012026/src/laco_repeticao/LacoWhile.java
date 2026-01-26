package laco_repeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		
		int contador = 5;
		
//		while (contador > 0) {
//			System.out.println("Contador: " + contador);		
//			contador--; // (operador unário) contador = contador - 1;
//		}
		
//		while (contador > 0) {
//			System.out.println("Contador: " + contador);		
//			contador -= 2; // contador = contador - 2;
//		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = scan.nextInt();
		
		
		int cont = 1;
		while (cont <= 20) {
			if (!(cont % 2 == 0)) {
				System.out.print(cont + " ");
			}

			cont++;
		}
				


	}

}
