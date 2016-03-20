package ExerciciosNivelamento;

import javax.swing.JOptionPane;

public class Ex06 {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Insira o valor em real: ");
		
		double valorDolar = Double.parseDouble(valor)*4;
		String msg = "Valor em dolar: "+valorDolar;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
