package ExerciciosDeDocumentacao;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		// Exercise without POO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Defina as medidas da area do triangulo X: ");
		
		System.out.print("X1: ");
		int x1 = sc.nextInt();
		System.out.print("X2: ");
		int x2 = sc.nextInt();
		System.out.print("X3: ");
		int x3 = sc.nextInt();
		
		System.out.println("\nDefina as medidas da area do triangulo Y: ");
		
		System.out.print("Y1: ");
		int y1 = sc.nextInt();
		System.out.print("Y2: ");
		int y2 = sc.nextInt();
		System.out.print("Y3: ");
		int y3 = sc.nextInt();
		
		double perimetro1 = (x1+x2+x3) / 2;
		double perimetro2 =	(y1+y2+y3) / 2;
		
		double area1 = Math.sqrt(perimetro1 * (perimetro1 - x1) * (perimetro1 - x2) * (perimetro1 - x3));
		double area2 = Math.sqrt(perimetro2 * (perimetro2 - y1) * (perimetro2 - y2) * (perimetro2 - y3));
		
		System.out.println("\n");
		System.out.printf("Area Triangulo X: %,.2f ", area1);
		
		System.out.println("\n");
		System.out.printf("Area Triangulo Y: %,.2f ", area2);
		
		if (area1 > area2)
			System.out.println("\n\nA area do triangulo X e maior!");
		else
			System.out.println("\n\nA area do triangulo Y e maior!");
		
		sc.close();
	}

}
