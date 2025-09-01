package TrianguloPOO;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Triangulo trianguloX = new Triangulo();
		Triangulo trianguloY = new Triangulo();
		Scanner sc = new Scanner(System.in);

		System.out.println("Defina os valores do Triangulo X: ");
		System.out.print("a: ");
		trianguloX.a = sc.nextDouble();
		System.out.print("b: ");
		trianguloX.b = sc.nextDouble();
		System.out.print("c: ");
		trianguloX.c = sc.nextDouble();

		System.out.println("\n\nDefina os valores do Triangulo Y: ");
		System.out.print("a: ");
		trianguloY.a = sc.nextDouble();
		System.out.print("b: ");
		trianguloY.b = sc.nextDouble();
		System.out.print("c: ");
		trianguloY.c = sc.nextDouble();

		System.out.printf("\nArea triangulo X: %,.2f",
				trianguloX.calcularAreaTriangulo(trianguloX.a, trianguloX.b, trianguloX.c));
		System.out.printf("\nArea triangulo Y: %,.2f",
				trianguloY.calcularAreaTriangulo(trianguloY.a, trianguloY.b, trianguloY.c));

		sc.close();
	}
}
