package MetodosEstaticos.ComEstatico;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double radius = sc.nextDouble();
		
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("\nCircunferencia: %,.2f", c);
		System.out.printf("\nVolume: %,.2f", v);
		System.out.printf("\nP.I: %,.2f", Calculator.PI);
		
		sc.close();
		
	}
	
}
