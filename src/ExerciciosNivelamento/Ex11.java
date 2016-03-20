package ExerciciosNivelamento;

import java.util.Scanner;

public class Ex11 {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		double f, c;
		System.out.println("Insira a temperatura em Fahrenheit: ");
		f = s.nextDouble();
		c = (f-32)*5/9;
		System.out.println("A temperatuda em Celsius é: "+c);
	}

}
