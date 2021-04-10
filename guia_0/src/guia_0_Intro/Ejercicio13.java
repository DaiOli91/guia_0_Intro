package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio13 {
	/*Programa que lea la longitud de los catetos de un tri�ngulo
rect�ngulo y calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras*/


	public void trece(Scanner scan) {
		
		System.out.println("\nEJERCICIO 13\n");
		
		float num1;
		float num2;
	
		System.out.println("Introduzca longitud de cateto B: ");
		num1 = scan.nextFloat();
		
		System.out.println("Introduzca longitud de cateto C: ");
		num2 = scan.nextFloat();
		
		float hipotenusa = (float) Math.sqrt(num1+num2);
			
			
		System.out.println("\nEl cateto B mide: "+num1+", el cateto C mide: "+num2+", y la hipotenusa mide: "+hipotenusa+"\n\n");
			
			}

}
