package exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		Scanner nota = new Scanner(System.in);
		double entrada = input.nextDouble();
		
		double notasTotal = 0;
		
		for(int i = 0;i<entrada; i++) {
			double notas = input.nextDouble();
			
			 notasTotal += notas;		
			
		}
		
		System.out.println(notasTotal/entrada);

	}

}
