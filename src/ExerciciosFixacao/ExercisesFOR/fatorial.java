package ExerciciosFixacao.ExercisesFOR;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 1;

		System.out.print("Numero que deseja saber o fatorial: ");
		int n = sc.nextInt();

		System.out.println("\n"); // Just to skip the line
		
		if (n == 0) {
			System.out.println("O fatorial de " + n + " e: " + 1);
			System.exit(0);
		}

		for (int i = 1; i <= n; i++) {
			total *= i;
		}
			// 1 x 2 x 3 x 4 x 5 = 125
		System.out.println("O fatorial de " + n + " e: " + total);
		sc.close();

	}
}