package ExerciciosNivelamento;

import java.util.Scanner;

public class Ex07 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		double b1,b2,b3,b4;
		System.out.println("Insira a nota do Bimestre 1: ");
		b1 = s.nextDouble();
		System.out.println("Insira a nota do Bimestre 2: ");
		b2 = s.nextDouble();
		System.out.println("Insira a nota do Bimestre 3: ");
		b3 = s.nextDouble();
		System.out.println("Insira a nota do Bimestre 4: ");
		b4 = s.nextDouble();
		
		double media = (b1+b2+b3+b4)/4;
		
		System.out.println("A média foi: "+media);
		if(media<=5){
			System.out.println("Aluno Aprovado!");
		}else{
			System.out.println("Aluno Reprovado!");
		}
		
	}

}
