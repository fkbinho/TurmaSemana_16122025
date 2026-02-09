package util;

import java.util.Scanner;

public class Input {
	private static final Scanner scan = new Scanner(System.in);
	
	public static int lerInt(String msg) {
		System.out.println(msg);
		while(!scan.hasNextInt()) {
			System.out.println("Digite um número válido.");
			scan.next(); // Limpa o valor inválido
		}
		int v = scan.nextInt();
		scan.nextLine(); // Limpa o buffer
		return v;
	}
	
	public static double lerDouble(String msg) {
		System.out.println(msg);
		while(!scan.hasNextDouble()) {
			System.out.println("Digite um número válido.");
			scan.next(); // Limpa o valor inválido
		}
		double v = scan.nextDouble();
		scan.nextLine(); // Limpa o buffer
		return v;
	}
	
	public static String lerString(String msg) {
		System.out.println(msg);
		return scan.nextLine();
	}
}
