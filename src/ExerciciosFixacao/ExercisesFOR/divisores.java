package ExerciciosFixacao.ExercisesFOR;

import java.util.Scanner;

public class divisores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero para calcularmos seus divisores: ");
		int n = sc.nextInt();

		System.out.println("Os divisores de " + n + " sao: ");

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.println(i);
			else
				continue;
		}
		sc.close();
	}

}