package revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaRevisao {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>(
				Arrays.asList("Ana", "Bruno", "Carlos", "Diana", "Eduardo")
				);		
		
		System.out.println(nomes);
		
		for(int i = 0; i < nomes.size(); i++) {
			if (i == 2) {
				nomes.add(i, "Gustavo");
			}
		}
		
//		for(String nome: nomes) {
//			System.out.println(nome);
//		}
		
//		nomes.add("Tadeu");
//		nomes.remove(2);
		System.out.println(nomes);
		
		nomes.add(1, "Jhon");
		System.out.println(nomes);
		
//		nomes.forEach(nome -> System.out.println(nome));
		
		
		
		
		
	}

}
