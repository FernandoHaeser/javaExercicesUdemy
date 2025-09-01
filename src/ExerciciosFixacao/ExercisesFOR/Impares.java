package ExerciciosFixacao.ExercisesFOR;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;

		do {

			System.out.print("\nDigite um valor inteiro: ");
			x = sc.nextInt();

			if (x < 1)
				System.out.println("\nO numero deve ser maior que 0");
			else if (x > 1000)
				System.out.println("\nO numero deve ser menor que 1000");
			else
				continue;

		} while (x < 1 || x > 1000);

		for (int i = 0; i < x; i++) {

			if (i % 2 == 1)
				System.out.println(i);

		}

		System.out.println("Fim do programa");
		sc.close();

	}

}