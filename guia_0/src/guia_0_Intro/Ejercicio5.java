package guia_0_Intro;

public class Ejercicio5 {
	/*Programa Java que declare una variable A de tipo entero, asignarle un valor. A
continuaci�n mostrar un mensaje indicando si A es par o impar*/

	public void cinco() {
		
		System.out.println("\nEJERCICIO 5\n");
		int A = 9;
		int rta = A % 2;

	
		System.out.println("A vale: " +A);
		
		if (rta == 0)
		{
			System.out.println("que es un n�mero par\n\n");
		}
		else
		{
			System.out.println("que es un n�mero impar\n\n");
		}
			}

}
