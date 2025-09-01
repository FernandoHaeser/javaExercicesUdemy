package RetanguloPOO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		boolean continuar = false;

		do {

			System.out.print("\nInforme o valor da altura do retangulo (cm): ");
			retangulo.height = sc.nextDouble();

			System.out.print("\nInforme o valor do comprimento do retangulo (cm): ");
			retangulo.lenght = sc.nextDouble();

			if (retangulo.height <= 0 || retangulo.lenght <= 0) {
				System.out.println("\nInsira valores maiores que 0 por favor!");
				continuar = false;
			} else if (retangulo.height == retangulo.lenght) {
				System.out.println("\nVoce informou as medidas de um quadrado!");
				continuar = false;
			} else {
				System.out.println("\nOs dados passaram na verificacao!");
				continuar = true;
			}
		} while (!continuar);

		System.out.println(retangulo.toString());
		
		sc.close();
	}

}
