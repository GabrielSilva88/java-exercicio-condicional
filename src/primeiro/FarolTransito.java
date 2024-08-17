/*
  Implemente um sistema de semáforo usando switch case.
  Receba um estado (vermelho, amarelo ou verde) e determine a ação apropriada.
  
 */
package primeiro;

import java.util.Scanner;

public class FarolTransito {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String sinal = "";

		System.out.println("Indira uma cor de sinal de transito: ");
		sinal = scan.nextLine();

		switch (sinal) {
		case "verde": {
			if (sinal != null) {
				System.out.println("* SIGA *");
			}
			break;
		}
		case "amarelo": {
			if (sinal != null) {
				System.out.println("* ATENÇÃO *");
			}
			break;
		}
		case "vermelho": {
			if (sinal != null) {
				System.out.println("* PARE *");
			}
			break;
		}
		default:
			System.out.println(sinal + " Não e uma cor do farol ");
			break;
		}

		/*
		 * Funciona como opção IF, ELSE IF e ELSE
		 
		 	if (sinal.equalsIgnoreCase("verde")) {
			System.out.println(" SIGA ");
		} else if (sinal.equalsIgnoreCase("amarelo")) {
			System.out.println(" ATENÇÃO ");
		} else if (sinal.equalsIgnoreCase("vermelho")) {
			System.out.println(" PARE ");
		} else {
			System.out.println(sinal + " Não e uma cor do farol ");
		}
		 */
	
	}
}
