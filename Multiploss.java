package exercicios;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int entrada = input.nextInt();
		
		//int entrada = 5;
		int multiplo = entrada;
		for(int count = 0; count < 10;count++) {			
				System.out.println(multiplo);
				
				multiplo += entrada;
		}
	}

}
