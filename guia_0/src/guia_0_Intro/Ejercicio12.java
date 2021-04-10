package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio12 {
	/*Programa que pase una velocidad en Km/h a m/s. La velocidad
se lee por teclado*/


	public void doce(Scanner scan) {
		
		System.out.println("\nEJERCICIO 12\n");
		
		float num;
	
		System.out.println("Introduzca velocidad en km/h: ");
		num = scan.nextFloat();
		
		float metros = (float)num * 1000;
			
			
		System.out.println("\nLa velocidad es: "+num+"km/h y es equivalente a "+(float)(metros / 3600)+" m/s\n\n");
			
			}

}
