package switchcase;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite um numero entre 1 e 7:");
		int numero = scan.nextInt();
		
		switch(numero) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda-feira");
		case 3 -> System.out.println("Terça-feira");
		case 4 -> System.out.println("Quarta-feira");
		case 5 -> System.out.println("Quinta-feira");
		case 6 -> System.out.println("Sexta-feira");
		case 7 -> System.out.println("Sábado");
		default -> System.out.println("Número inválido");
		}
		
//		if (numero == 1) {
//			System.out.println("Domingo");
//		} else if (numero ==2) {
//			System.out.println("Segunda-feira");
//		} else if(numero == 3) {
//			System.out.println("Terça-feira");
//		} else if(numero == 4) {
//			System.out.println("Quarta-feira");
//		} else if(numero == 5) {
//			System.out.println("Quinta-feira");
//		} else if(numero == 6) {
//			System.out.println("Sexta-feira");
//		} else if(numero == 7) {
//			System.out.println("Sábado");
//		} else {
//			System.out.println("Número inválido");
//		}
		
		String dia = switch(numero) {
		case 1 -> "Domingo";
		case 2 -> "Segunda-feira";
		case 3 -> "Terça-feira";
		case 4 -> "Quarta-feira";
		case 5 -> "Quinta-feira";
		case 6 -> "Sexta-feira";
		case 7 -> "Sábado";
		default -> "Número inválido";
		};
		
		System.out.println(dia);
		
		
	}

}
