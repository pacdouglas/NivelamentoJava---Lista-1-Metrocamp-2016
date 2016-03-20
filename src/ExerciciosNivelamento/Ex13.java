package ExerciciosNivelamento;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		int soma=0;
		double media;
		System.out.println("Insira 10 valores inteiros: ");
		for(int i=0;i<10;i++){
			vetor.add(s.nextInt());
			soma+=vetor.get(i);
		}
		media=(double)soma/10;
		System.out.println("A média dos números foi: "+media);
	}
	
}
