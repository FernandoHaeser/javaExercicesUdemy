package funcionarioPOO;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		String[] options = { "Sim", "Nao" };
		boolean temVT = false, temVR = false;

		funcionario.setName(JOptionPane.showInputDialog("Informe seu nome:"));
		funcionario.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario:")));

		int vt = JOptionPane.showOptionDialog(null, // Componente pai (null = centralizado)
				"Voce possui VT", // Mensagem exibida
				"VT", // Título da janela
				JOptionPane.YES_NO_OPTION, // Tipo de botão (usado como padrão, mas com opções customizadas)
				JOptionPane.PLAIN_MESSAGE, // Tipo de mensagem (sem ícones)
				null, // Sem ícone personalizado
				options, // Opções exibidas
				options[0]);

		int vr = JOptionPane.showOptionDialog(null, // Componente pai (null = centralizado)
				"Voce possui VR", // Mensagem exibida
				"VR", // Título da janela
				JOptionPane.YES_NO_OPTION, // Tipo de botão (usado como padrão, mas com opções customizadas)
				JOptionPane.PLAIN_MESSAGE, // Tipo de mensagem (sem ícones)
				null, // Sem ícone personalizado
				options, // Opções exibidas
				options[0]);

		if (vt == 1)
			temVT = true;
		else if (vr == 1)
			temVR = true;
		else {
			temVT = false;
			temVR = false;
		}

		funcionario.liquidSalary(temVT, temVR);
		JOptionPane.showMessageDialog(null, funcionario.toString());

		funcionario.plusSalary(Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do seu bonus:")));
		JOptionPane.showMessageDialog(null, funcionario.toString());

	}
}