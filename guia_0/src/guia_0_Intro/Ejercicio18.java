package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio18 {
	/*Programa que lea tres n�meros enteros H, M, S que contienen
hora, minutos y segundos respectivamente, y comprueba si la hora que indican
es una hora v�lida*/


	public void dieciocho(Scanner scan) {
		
		System.out.println("\nEJERCICIO 18\n");

		int H;
		int M;
		int S;
		
		boolean condicion = true;

while (condicion) {
	
	System.out.println("Introduzca una hora (0 a 24): ");
	H = scan.nextInt();
	if ((H>=0) && (H<24)) {
		
		System.out.println("Introduzca los minutos (0 a 59): ");
		M = scan.nextInt();
		if ((M>=0) && (M<60)) {
			System.out.println("Introduzca los segundos (0 a 59): ");
			S = scan.nextInt();
			if ((S>=0) && (S<60)) {
				System.out.println("\nLa hora es: "+H+":"+M+":"+S+"\n\n");
				condicion = false;
			}
			else {
				while ((S<0) || (S>59)) {
					
					System.out.println(" Se ha producido un error. Intente nuevamente\n");
					System.out.println("Introduzca los segundos (0 a 59): ");
					scan.nextInt();
					S = scan.nextInt();
				}
					
				}
		}
		else {
			while ((M<0) || (M>59)) {
				
				System.out.println(" Se ha producido un error. Intente nuevamente\n");
				System.out.println("Introduzca los minutos (0 a 59): ");
				scan.nextInt();
				M = scan.nextInt();
			}

		}
		
	}
	else {
		while ((H<0) || (H>23)) {
			
			System.out.println(" Se ha producido un error. Intente nuevamente\n");
			System.out.println("Introduzca una hora (0 a 24): ");
			scan.nextInt();
			H = scan.nextInt();			
			
		}

	}
	
}
		
		
		
			
			}

}
