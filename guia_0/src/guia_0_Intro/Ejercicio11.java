package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio11 {
	/*Programa que lee por teclado el valor del radio de una circunferencia 
	 * y calcula y muestra por pantalla la longitud y el �rea de la circunferencia*/


	public void once(Scanner scan) {
		
		System.out.println("\nEJERCICIO 11\n");
		

		float num;
	
		System.out.println("Introduzca el radio de la circunferencia: ");
		num = scan.nextFloat();
		
		float radiocuadrado = (float)num * num;
			
			
		System.out.println("\nEl radio es: "+num+", su di�metro es: "+(float)(num * 3.14)+", y su �rea es: "+(float)(radiocuadrado * 3.14)+"\n\n");
			
			}

}
