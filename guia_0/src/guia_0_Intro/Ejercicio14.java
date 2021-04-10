package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio14 {
	/*Programa que calcula el volumen de una esfera*/


	public void catorce(Scanner scan) {
		
		System.out.println("\nEJERCICIO 14\n");
		
		float num;
		
		System.out.println("Introduzca el radio de la circunferencia: ");
		num = scan.nextFloat();
		// f�rmula para el volumen: 4/3 de pi por  radio al cubo - tomamos 1.33
		float radiocubo = (float)(num * num * num);
			
		System.out.println("\nEl radio mide: "+num+", y el volumen mide: "+(float)((1.33 * 3.14) * radiocubo)+"\n\n");
			
			}

}
