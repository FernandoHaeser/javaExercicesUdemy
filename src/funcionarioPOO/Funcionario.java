package funcionarioPOO;

public class Funcionario {

	private String name;
	private double salary;
	private double impost;
	public double liquidSalary;

	// Getters and Setters
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setImpost(double impost) {
		this.impost = impost;
	}

	public double getImpost() {
		return this.impost;
	}

	public void liquidSalary(boolean temVT, boolean temVR) { // Verificao IF-ELSE gerada por I.A

		double inss, irpf, vt = 0, vr = 0;

		// INSS (base 2024)
		if (salary <= 1412.00) {
			inss = salary * 0.075;
		} else if (salary <= 2666.68) {
			inss = (1412.00 * 0.075) + ((salary - 1412.00) * 0.09);
		} else if (salary <= 4000.03) {
			inss = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09) + ((salary - 2666.68) * 0.12);
		} else if (salary <= 7786.02) {
			inss = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09) + ((4000.03 - 2666.68) * 0.12)
					+ ((salary - 4000.03) * 0.14);
		} else {
			inss = 908.86; // teto do INSS 2024
		}

		// IRPF (base 2024)
		double baseCalculoIR = salary - inss;
		if (baseCalculoIR <= 2259.20) {
			irpf = 0;
		} else if (baseCalculoIR <= 2826.65) {
			irpf = (baseCalculoIR * 0.075) - 169.44;
		} else if (baseCalculoIR <= 3751.05) {
			irpf = (baseCalculoIR * 0.15) - 381.44;
		} else if (baseCalculoIR <= 4664.68) {
			irpf = (baseCalculoIR * 0.225) - 662.77;
		} else {
			irpf = (baseCalculoIR * 0.275) - 896.00;
		}

		// Vale-Transporte: geralmente 6% do salário bruto
		if (temVT) {
			vt = salary * 0.06;
		}

		// Vale-Refeição: simulação de R$25/dia útil (22 dias)
		if (temVR) {
			vr = 25 * 22;
		}

		liquidSalary = salary - inss - irpf - vt - vr;
	}

	public void plusSalary(double percent) {
		double plus = (salary * percent) / 100;
		salary += plus;
	}

	public String toString() {
		return "Seu nome e: " + this.name + "\n" 
				+ "Salario Liquido: R$" + liquidSalary + "\n"
				+ "Salario Bruto: R$" + this.salary;
	}

}