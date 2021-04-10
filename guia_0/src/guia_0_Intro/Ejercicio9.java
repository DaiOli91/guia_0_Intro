package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio9  {
	/*Programa Java que lee un n�mero entero por teclado y calcula el
doble y el triple de ese n�mero y muestra por pantalla*/


	public void nueve(Scanner scan) {
		
		System.out.println("\nEJERCICIO 9\n");
		
		System.out.println("Introduzca un n�mero entero: ");
		int num = scan.nextInt();
		
		System.out.println("\nEl n�mero es: "+num);
		System.out.println("\nSu duplo es: "+(2*num));
		System.out.println("\nSu triplo es: "+(3*num)+"\n\n");
		

			}

}
