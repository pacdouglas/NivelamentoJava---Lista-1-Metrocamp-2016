package ExerciciosNivelamento;

import java.util.Scanner;

public class Ex08 {
	private static Scanner s;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		double comp, larg;
		
		System.out.println("Insira a largura do retangulo: ");
		larg = s.nextDouble();
		System.out.println("Insira o comprimento do retangulo: ");
		comp = s.nextDouble();
		
		double area = larg*comp;
		double perimetro = (2*larg)+(2*comp);
		
		System.out.println("Área do Retangulo: "+area+"\n"+
						   "Perímetro do Retangulo: "+perimetro);
	}

}
