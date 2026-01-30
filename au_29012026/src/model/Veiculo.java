package model;

public class Veiculo {
	// Atributos
	private String marca;
	private String modelo;
	private int ano;
	
	// Construtor
	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	// Métodos´
	public void ligar() {
		System.out.println("O veículo " + modelo + " está ligado.");
	}
	
	public void desligar() {
		System.out.println("O veículo " + modelo + " está desligado.");
	}
	
	public void acelerar() {
		System.out.println("O veículo " + modelo + " está acelerando.");
	}
	
	public double calcularConsumo(double distancia, double litros) {
		return distancia / litros;	
	}

	// Getters e Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
