package switchcase;

public class Exemplo {

	public static void main(String[] args) {
		 int numero = 3;

	     String resultado = switch (numero) {
	     case 1 -> "Você escolheu Um.";
	     case 2 -> "Você escolheu Dois.";
	     case 3 -> "Você escolheu Três.";
	     default -> "Número inválido.";
	     };
	     System.out.println(resultado);
	     
	     int valor = 1;
	     
	     int exemplo = switch (valor) {
	     case 1 -> {
	    	 int temp = 10;
	         temp += 5;
	         yield temp; // Usando 'yield' para retornar um valor do bloco
	     }
	     case 2 -> 20;
	     case 3 -> 100;
	     default -> 0;
	     };
	     
	     System.out.println(exemplo);

	}

}
