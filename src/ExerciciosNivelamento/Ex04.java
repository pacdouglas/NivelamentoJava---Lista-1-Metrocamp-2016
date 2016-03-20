package ExerciciosNivelamento;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Insira um número");
		String num2 = JOptionPane.showInputDialog("Insira outro número:");
		
		if(Integer.parseInt(num1)>Integer.parseInt(num2)){
			System.out.print("O maior número foi:"+num1);
		}else{
			System.out.print("O maior número foi:"+num2);
		}

	}

}
