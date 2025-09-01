package MetodosEstaticos.SemEstatico;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("Digite o raio: ");
		double radius = sc.nextDouble();
		
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("\nCircunferencia: %,.2f", c);
		System.out.printf("\nVolume: %,.2f", v);
		System.out.printf("\nP.I: %,.2f", calc.PI);
		
		sc.close();
		
	}
	
}
