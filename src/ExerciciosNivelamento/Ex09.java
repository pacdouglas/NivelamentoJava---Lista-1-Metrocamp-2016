package ExerciciosNivelamento;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {
		String areaTerreno = JOptionPane.showInputDialog("Insira a �rea total do terreno: ");
		String areaConstruida = JOptionPane.showInputDialog("Insira a �rea construida: ");
		
		Double terreno = (Double.parseDouble(areaTerreno)-Double.parseDouble(areaConstruida))*3.80;
		Double construcao = Double.parseDouble(areaConstruida)*5;
		double imposto = terreno+construcao;
		String msg = "O valor a ser pago em imposto �: R$"+imposto;
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
