package exercicio;

import java.util.Scanner;

public class SenhaCofre {

	public static void main(String[] args) {
		/* • A senha correta é 1234.
		   • O usuário terá no máximo 
		     3 tentativas. 
		   • Se acertar a senha,
		   	 exiba: "Acesso liberado!"
		   • Se errar 3 vezes, exiba:
		     "Cofre bloqueado por tentativas 
		     incorretas."
		 * */

		Scanner scan = new Scanner(System.in);
		
		int senhaCorreta = 1234;
		int tentativas = 3;
		
		int senhaDigitada;
		while(tentativas > 0) {
			
			System.out.println("Digite a senha do cofre:");
			senhaDigitada = scan.nextInt();
			
			if(senhaDigitada == senhaCorreta) {
				System.out.println("Acesso liberado!");
				break;
			} else {
				tentativas--; // tentativas = tentativas - 1;
				System.out.println("Senha incorreta. ");
				System.out.println("Tentativas restantes: " 
									+ tentativas);
			}
			
		}
		
		if (tentativas == 0) {
			System.out.println("Cofre bloqueado por "
					+ "tentativas incorretas.");
		}
		
	}

}
