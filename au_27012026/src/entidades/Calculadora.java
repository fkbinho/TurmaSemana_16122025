package entidades;

public class Calculadora {

	public void soma(int a, int b) {
		System.out.println("Soma de inteiros: " + (a + b));
	}
	
	public void soma(double a, double b) {
		System.out.println("Soma de double: " + (a + b));
	}
	
	public void soma(int a, int b, int c) {
		System.out.println("Soma de três inteiros: " + (a + b + c));
	}
	
	public void soma(double a, double b, double c) {
		System.out.println("Soma de três double: " + (a + b + c));
	}
}
