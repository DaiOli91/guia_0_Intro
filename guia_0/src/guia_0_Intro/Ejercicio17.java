package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio17 {
	/*Programa que lea un n�mero entero N de 5 cifras y muestre las
cifras que ocupan posiciones impares*/


	public void diecisiete(Scanner scan) {
		
		System.out.println("\nEJERCICIO 17\n");

		int num;

	
		System.out.println("Introduzca un n�mero de 5 cifras: ");
		num = scan.nextInt();
		
		int resto1 = (int) num % 10000;
		int primera = (int) num / 10000;
		
		int resto2 = (int) resto1 % 1000;
		int tercera = (int) resto2 / 100;
		
		int quinta = (int) resto2 % 10;


		System.out.println("\nEl n�mero es: "+num+" y las cifras impares son: "+primera+", "+tercera+", y "+quinta+"\n\n");
		
			
			}

}
