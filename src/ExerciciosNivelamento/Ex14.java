package ExerciciosNivelamento;

import javax.swing.JOptionPane;
import ExerciciosNivelamento.Pessoa;
public class Ex14 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome(JOptionPane.showInputDialog("Insira o nome da pessoa1: "));
		pessoa1.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da pessoa1: ")));
		
		pessoa2.setNome(JOptionPane.showInputDialog("Insira o nome da pessoa2: "));
		pessoa2.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da pessoa2: ")));
		
		String msg = "A pessoa mais pesada é: "+ Pessoa.maisPesada(pessoa1, pessoa2);
		JOptionPane.showMessageDialog(null, msg);
	}

}
