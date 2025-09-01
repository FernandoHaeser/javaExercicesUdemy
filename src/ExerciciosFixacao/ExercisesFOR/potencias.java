package ExerciciosFixacao.ExercisesFOR;

import java.util.Scanner;

public class potencias {

	public static void calcularPotenciaManual() {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		sc.close();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que opcao voce deseja realizar?");
		System.out.println("[1] Manual");
		System.out.println("[2] Math.pow");
		System.out.print("R: ");
		int r = sc.nextInt();
		
		switch (r) {
		
		case 1: 
			calcularPotenciaManual();
			break;
		case 2:
			System.out.print("Digite um numero ai: ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.println(Math.pow(i, 1) + " " + (Math.pow(i, 2)) + " " + (Math.pow(i, 3)));
			}
			break;
		}
		
		sc.close();
	}

}
