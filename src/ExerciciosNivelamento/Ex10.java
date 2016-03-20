package ExerciciosNivelamento;

import java.util.Scanner;

public class Ex10 {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		double v, r, a;
		
		System.out.println("Insira o raio da lata: ");
		r = s.nextDouble();
		System.out.println("Insira a area da lata: ");
		a = s.nextDouble();
		v = 3.14159*r*r*a;
		System.out.println("O volume da lata é de: "+v);
	}
}
