/*
 * Crie um programa que recebe uma nota musical (A, B, C, D, E ou F) e fornece informações sobre ela, como a frequência.
 */
package segundo;

import java.util.Scanner;

public class FrequenciaNotasMusical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Digite uma nota musical: ");
		char nota = scan.next().charAt(0);

		switch (nota) {
		case 'A' : {
			System.out.println(nota + " É a cifra da nota LÁ sua frequência e 220,044Hz. ");
			break;
		}
		case 'B': {
			System.out.println(nota + " É a cifra da nota SI sua frequência e 247,500Hz. ");
			break;
		}
		case 'C' : {
			System.out.println(nota + " É a cifra da nota DÓ sua frequência e 247,500Hz. ");
			break;
		}
		case 'D': {
			System.out.println(nota + " É a cifra da nota RÉ sua frequência e 148,500Hz. ");
			break;
		}
		case 'E':{
			System.out.println(nota + " É a cifra da nota MI sua frequência e 165,000Hz. ");
			break;
		}
		case 'F':{
			System.out.println(nota + " É a cifra da nota FÁ sua frequência e 175,956Hz. ");
			break;
		}
		default:
			System.out.println("Não e uma nota Musical" + nota);
		} 
	}

}
