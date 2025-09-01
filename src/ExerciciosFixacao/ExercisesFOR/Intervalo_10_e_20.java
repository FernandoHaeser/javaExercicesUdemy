package ExerciciosFixacao.ExercisesFOR;

import java.util.Scanner;

public class Intervalo_10_e_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N, in = 0, out = 0;

		System.out.print("Escreva o valor de numeros que seram lidos: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.print("\nDigite um valor aqui dentro para o sistema conferir se esta dentro do intervalo [10,20]: ");
			int v = sc.nextInt();

			if (v < 10 || v > 20)
				out++;
			else
				in++;
		}

		System.out.println("\n" + in + " estao dentro do intervalo [10,20]");
		System.out.println("\n" + out + " estao fora do intervalo [10,20]");

		sc.close();
	}

}
