/*
 * Crie um programa que recebe uma nota musical (A, B, C, D, E ou F) e fornece informações sobre ela, como a frequência.
 */
package segundo;

import java.util.Scanner;

public class FrequenciaNotasMusical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Digite uma nota musical ");
		char nota = scan.next().charAt(0);

		switch (nota) {
		case 'A' : {
			System.out.println();
			break;
		}
		case 'B': {
			System.out.println();
			break;
		}
		case 'C' : {
			System.out.println();
			break;
		}
		case 'D': {
			System.out.println();
			break;
		}
		case 'E':{
			System.out.println();
			break;
		}
		case 'F':{
			System.out.println();
			break;
		}
		default:
			System.out.println("Não e uma nota Musical" + nota);
		} 
	}

}
