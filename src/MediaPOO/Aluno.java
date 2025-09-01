package MediaPOO;

import javax.swing.JOptionPane;

public class Aluno {

	private String name;

	double[] nota = new double[3];

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public double notaFinal() {
		return nota[0] + nota[1] + nota[2];
	}

	public void setNotas() {
		for (int i = 0; i < nota.length; i++) {
			if (i == 0) {
				do {
					nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
					if (nota[i] > 30 || nota[i] < 0)
						JOptionPane.showMessageDialog(null, "Informe uma nota valida por favor!");
				} while (nota[i] > 30 || nota[i] < 0);
			} else {
				do {
					nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
					if (nota[i] > 35 || nota[i] < 0)
						JOptionPane.showMessageDialog(null, "Informe uma nota valida por favor!");
				} while (nota[i] > 35 || nota[i] < 0);
			}
		}
	}

	public String aprovacao() {
		if (notaFinal() >= (100 * 0.6)) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
	
	public String toString() {
		return "Aluno: " + getName() + "\n" + 
				"Nota Final: " + notaFinal() + "\n" + 
				"Resultado: " + aprovacao();
	}
}