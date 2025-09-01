package MediaPOO;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		boolean programa = true;
		String[] options = {"Sim", "Nao"};
		
		do {
		
		Aluno aluno = new Aluno();

		aluno.setName(JOptionPane.showInputDialog("Informe seu nome:"));

		aluno.setNotas();

		JOptionPane.showMessageDialog(null, aluno.toString());
		
		int repetir = JOptionPane.showOptionDialog(null,
				"Voce deseja repetir o processo?", 
				"Janela de Saida", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				options, 
				options[0]);
		
		if (repetir == 0)
			programa = false;
		else
			programa = true;
		
		} while (!programa);
	}
}