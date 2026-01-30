package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		/* Classes involucros:
		 * int -> Integer
		 * double -> Double
		 * char -> Character
		 * boolean -> Boolean
		 * */
		
		List<Integer> idades = new ArrayList<>();
		
		// Adicionando elementos na lista
		idades.add(20);
		idades.add(25);
		idades.add(10);
		idades.add(50);
		idades.add(34);
		
		// Imprimindo a lista como coleção
		System.out.println(idades);
		for(int i = 0; i < idades.size() ; i++) {
			System.out.println(idades.get(i));
		}
		
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Ana"); // 0
		nomes.add("Pedro"); // 1
		nomes.add("Juliana"); // 2
		nomes.add("Carlos"); // 3
		nomes.add("Tadeu"); // 4	

		// Pegando um elemento específico
		System.out.println(nomes.get(2));
		
		
		for(int i = 0; i < nomes.size() ; i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("-------------------");
		
		// Criando uma lista de Compras
		List<String> listaDeCompras = new ArrayList<>();
		
		listaDeCompras.add("Arroz");
		listaDeCompras.add("Feijão");
		listaDeCompras.add("Macarrão");
		listaDeCompras.add("Carne");
		listaDeCompras.add("Café");
		
		System.out.println("Lista de Compras:");
		for(int i = 0; i < listaDeCompras.size(); i++) {
			System.out.printf("%d. %s%n", i+1, listaDeCompras.get(i));
		}
		// Remove elemento da lista
//		listaDeCompras.remove(1);
//		System.out.println(listaDeCompras);
//		listaDeCompras.add("Cuscuz");
		
		// Substituindo elemento em uma posição específica
		listaDeCompras.set(1, "Cuscuz");
		System.out.println(listaDeCompras);
		
		// Ordena a lista em ordem alfabética 
		Collections.sort(listaDeCompras);
		System.out.println(listaDeCompras);
		System.out.println(listaDeCompras);
		
		listaDeCompras.add(2, "Cerveja");
		System.out.println(listaDeCompras);
		
		boolean existe = listaDeCompras.contains("Macarrão Parafuso");
		
		if(existe) {
			System.out.println("Item encontrado na lista de compras.");
		} else {
			listaDeCompras.add("Macarrão Parafuso");
		}
		System.out.println(listaDeCompras);
		
		
		listaDeCompras.add(0,"Macarrão Parafuso");
		System.out.println(listaDeCompras);

		listaDeCompras.remove(String.valueOf("Macarrão Parafuso"));
		System.out.println(listaDeCompras);
		
		System.out.println("----------------");
		
		for(String item : listaDeCompras) {
			if(item.equals("Cerveja")) {
				listaDeCompras.remove(item);
			}
		}
		
	}

}
