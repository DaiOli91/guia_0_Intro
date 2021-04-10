package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio15 {
	/*Programa que calcula el �rea de un tri�ngulo a partir de la
longitud de sus lados*/


	public void quince(Scanner scan) {
		
		System.out.println("\nEJERCICIO 15\n");

		float num1;
		float num2;
	
		System.out.println("Introduzca longitud de cateto A: ");
		num1 = scan.nextFloat();
		
		System.out.println("Introduzca longitud de cateto B: ");
		num2 = scan.nextFloat();
		
		//tomo el lado A como altura y el lado B como la base
		
					
		System.out.println("\nLos lados miden: "+num1+" y "+num2+", y el area mide: "+(float)((num2 * num1)/2)+"\n\n");
			
			}

}
