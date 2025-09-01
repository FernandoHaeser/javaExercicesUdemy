package TrianguloPOO;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;

	public double calcularAreaTriangulo(double a, double b, double c) {
	
		double sp = (a + b + c) / 2; // Calcula semiperimetro
		
		double area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c)); // Calcula area
	
		return area;
	} 
}
