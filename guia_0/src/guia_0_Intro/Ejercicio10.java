package guia_0_Intro;

import java.util.Scanner;

public class Ejercicio10  {
	/*Programa que lea una cantidad de grados Fahrenheit y la pase
a grados cent�grados*/


	public void diez(Scanner scan) {
		
		System.out.println("\nEJERCICIO 10\n");
		
		boolean seguir = true;
		float num;
		
		while (seguir) {
			System.out.println("Introduzca una temperatura en grados F�: ");
			num = scan.nextFloat();
			// para el pasaje resto 32�
			
			
			System.out.println("\nLa temperatura en F� es: "+num+" y en C� es: "+(float)(num-32)+"\n");
			System.out.println("\nIngrese SI para continuar");
			scan.nextLine();
			String opcion = scan.nextLine();
			
			if (opcion.equalsIgnoreCase("si"))	{
				
				seguir = true;
			}
			else {
				
				seguir =  false;
				System.out.println("\nQue tenga un buen d�a!\n\n");
			}
		}
		

			}

}
