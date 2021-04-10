package guia_0_Intro;

import java.util.Scanner;


public class Ejercicio16 {
	/*Programa que lee un n�mero de 3 cifras y muestra sus cifras por
separado*/


	public void diecises(Scanner scan) {
		
		System.out.println("\nEJERCICIO 16\n");

		int num;

	
		System.out.println("Introduzca un n�mero de 3 cifras: ");
		num = scan.nextInt();
		
		int resto = (int) num % 100;
		int primera = (int) num / 100;
		
		int tercera = (int) resto % 10;
		int segunda = (int) resto / 10;
		
		
		System.out.println("\nEl n�mero es: "+num+" y las cifras son: "+primera+", "+segunda+", y "+tercera+"\n\n");
		

			
			}

}
