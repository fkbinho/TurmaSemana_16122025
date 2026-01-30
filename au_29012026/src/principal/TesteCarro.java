package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Carro> listaCarros = new ArrayList<>();
//		Veiculo v1 = new Veiculo("Toyota", "Corolla", 2020);
//
//		v1.setModelo("Camry");
//
//		System.out.println(v1.getModelo());
//		v1.ligar();
//
//		Carro c1 = new Carro("Honda", "Civic", 2019, 4);
//
//		System.out.println(c1.getMarca());
//
//		c1.ligar();
//
//		System.out.println(c1.calcularConsumo(20, 5.5));
		
		while(true) {
			System.out.println("Digite os dados do carro:");
			System.out.println("Marca:");
			String marca = scan.nextLine();
			System.out.println("Modelo:");
			String modelo = scan.nextLine();
			System.out.println("Ano:");
			int ano = scan.nextInt();
			scan.nextLine(); // Consumir a quebra de linha
			
			Carro c = new Carro(marca, modelo, ano, 4);
			listaCarros.add(c);
//			listaCarros.add(new Carro(marca, modelo, ano, 4));
			
			System.out.println("Deseja continuar:");
			String resp = scan.nextLine();
			
			if(resp.equalsIgnoreCase("n")) {
				break;
			}
			
		}
		
		System.out.println("Carros cadastrados:");
		
//		for(Carro carro : listaCarros) {
//			System.out.println(carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno());
//		}
		
		for(int i = 0; i < listaCarros.size(); i++) {
			Carro c = listaCarros.get(i);
			
			if(c.getMarca().equalsIgnoreCase("Fiat")) {
				c.setModelo("Palio");
			}
		}
		
	}

}
