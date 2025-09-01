package ExerciciosFixacao.ExercisesFOR;

import java.util.Scanner;

public class divisao_segundo_termo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int v, d;
		double div;

		System.out.print("Quantos numeros pares voce quer ler? ");
		int n = sc.nextInt();

		double[] divisoes = new double[n];
		boolean[] zero = new boolean[n];

		for (int i = 0; i < n; i++) {
			System.out.print("\nPrimeiro termo: ");
			v = sc.nextInt();
			System.out.print("Segundo termo: ");
			d = sc.nextInt();

			if (d == 0) {
				zero[i] = false;
				continue;
			} else {
				zero[i] = true;
				div = v / d;
				divisoes[i] = div;
			}
		}

		for (int i = 0; i < n; i++) {
			if (zero[i] == false)
				System.out.println("\nDivisao impossivel!!!");
			else
				System.out.println("\n" + divisoes[i]);
				
			sc.close();

		}

	}
}
