package RetanguloPOO;

public class Retangulo {

	public double height;
	public double lenght;

	public double area() {
		return height * lenght;
	}

	public double perimetro() {
		return (2 * height) + (2 * lenght);
	}

	public double diagonal() {
		double d = Math.sqrt((Math.pow(height, 2)) + (Math.pow(lenght, 2)));
		return d;
	}

	
	/*
	
	public boolean validarRetangulo(double height, double lenght, boolean continuar) {
		
		if (height <= 0 || lenght <= 0) {
			System.out.println("Insira valores maiores que 0 por favor!");
			continuar = false;
		} else if (height == lenght) {
			System.out.println("Voce informou as medidas de um quadrado!");
			continuar = false;
		} else {
			System.out.println("Os dados passaram na verificacao!");
			continuar = true;
		}
		return continuar;
	}
	
	*/
	
	public String toString() {
		return ("\nArea: " + area() + "cm²" +
				"\nPerimetro: " + perimetro() + "cm" +
				"\nDiagonal: " + diagonal()) + "cm";
	}
}