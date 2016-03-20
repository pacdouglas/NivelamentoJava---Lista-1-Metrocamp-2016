package ExerciciosNivelamento;

import java.util.Scanner;

public class Ex12 {
		private static Scanner s;
	public static void main(String[] args) {
		int a,b,aux;
		s = new Scanner(System.in);
		
		System.out.println("Insira a:");
		a = s.nextInt();
		System.out.println("Insira b:");
		b = s.nextInt();
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("Valor de A: "+a+" Valor de B: "+b);
		
		
	}

}
