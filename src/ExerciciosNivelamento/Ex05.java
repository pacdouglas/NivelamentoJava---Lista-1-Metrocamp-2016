package ExerciciosNivelamento;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		
		String letra = JOptionPane.showInputDialog("Insira M ou F");
		
		if(letra.equals("M")){
			System.out.println("Masculino");
		}else if(letra.equals("F")){
			System.out.println("Feminino");
		}else{
			System.out.println("Sexo Inválido");
		}
		
		
	}

}
