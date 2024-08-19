/* 
 Desenvolva um conversor que recebe uma unidade de medida (metro, centímetro, quilômetro) 
 e converte para outra unidade com base na entrada. 
    
*/
package terceiro;

import java.util.Scanner;

public class ConverterMedidas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double medida = 0, convM = 0, convKm = 0, convCm = 0;
		String opc = "";

		System.out.println("Digite uma Opção de medida(M, KM, CM): ");
		opc = scan.nextLine();
		System.out.println("Digite o valor para converter: ");
		medida = scan.nextDouble();

		if (opc.equalsIgnoreCase("M") || opc.equalsIgnoreCase("metro") && medida != 0) {
			convM = medida * 100;
			System.out.println("Valor de metros para centímetros é " + convM);
			convCm = medida / 1000;
			System.out.println("Valor de metros para quilômetros é " + convKm);
		} else if (opc.equalsIgnoreCase("CM") || opc.equalsIgnoreCase("centimetro") && medida != 0) {
			convM = medida / 100;
			System.out.println("Valor de centímetros para metros é " + convM);
			convCm = medida / 100000;
			System.out.println("Valor de centímetros para quilômetros é " + convKm);
		} else if (opc.equalsIgnoreCase("KM") || opc.equalsIgnoreCase("quilometro") && medida != 0) {
			convM = medida * 100000;
			System.out.println("Valor de quilômetros para centímetros é " + convM);
			convCm = medida * 1000;
			System.out.println("Valor de quilômetros para metros é " + convKm);
		} else {
			System.out.println(" não e um opção de converção ");
		} 
	}

}
