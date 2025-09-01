package ExerciciosFixacao.ExercisesFOR;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		double v1, v2, v3, total;

		System.out.print("Quantas medias voce deseja calcular? ");
		n = sc.nextInt();

		double[] medias = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.print("\n\nDigite o primeiro valor: ");
			v1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			v2 = sc.nextDouble();
			System.out.print("Digite o terceiro valor: ");
			v3 = sc.nextDouble();

			total = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;

			medias[i] = total;
		}

		for (int i = 0; i < n; i++) {
			System.out.println("\nMedia " + (i + 1) + ": "+ medias[i]);
		}

		sc.close();

	}

}
