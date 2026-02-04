package revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExercicoList {

	public static void main(String[] args) {
		// Crie uma Lista com vinte números aleatórios.
		Random r = new Random();
		
		List<Integer> numeros = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			numeros.add(r.nextInt(1, 51));
		}
		
		System.out.println(numeros);
		System.out.println("--------------------");
		
		// Adicione o número 11 à Lista criada no exercício anterior.
		numeros.add(11);
		System.out.println(numeros);
		System.out.println("--------------------");
		
		// Remova o número na 5ª posição da Lista.
		numeros.remove(4);
		System.out.println(numeros);
		System.out.println("--------------------");
		
		// Concatene a Lista atual com uma nova Lista contendo 
		// os números de 12 a 15.
		List<Integer> numeros2 = new ArrayList<>(Arrays.asList(12, 13, 14, 15));
		numeros.addAll(numeros2);
		System.out.println(numeros);
		System.out.println("--------------------");
		
		// Encontre o comprimento da Lista resultante.
		System.out.println("Tamanho da lista:" + numeros.size());
		
		// Verifique se o número 8 está presente na Lista.
		if(numeros.contains(8)) {
			System.out.println("Contém o número 8 na lista.");
		} else {
			System.out.println("Não contém o número 8 na lista.");
		}
		
		// Inverta a ordem dos elementos na Lista.
//		List<Integer> listaInvertida = new ArrayList<>();
//		for(int i = numeros.size() - 1; i >= 0; i--) {
//			listaInvertida.add(numeros.get(i));
//		}
//		numeros.clear();
//		numeros.addAll(listaInvertida);
//		System.out.println(numeros);
//		System.out.println("--------------------");
		
		Collections.reverse(numeros);
		System.out.println();
		System.out.println(numeros);
		System.out.println("--------------------");
		
		// Remova todos os números pares da Lista
//		List<Integer> impares = new ArrayList<>();
//
//		for(int i = 0; i < numeros.size(); i++) {
//				if(numeros.get(i) % 2 != 0) {
//					impares.add(numeros.get(i));
//				}
//		}
//			
//		numeros.clear();
//		numeros.addAll(impares);
//		System.out.println(numeros);
			
		numeros.removeIf(n -> n % 2 == 0);
		System.out.println(numeros);
		System.out.println("--------------------");
		
		// Substitua o valor da 3ª posição por 30.
		numeros.set(2, 30);
		System.out.println(numeros);
		System.out.println("--------------------");
		
		// Ordene a Lista de forma crescente.
		Collections.sort(numeros);
		System.out.println(numeros);
		System.out.println("--------------------");
		
	}

}
