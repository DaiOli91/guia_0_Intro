package guia_0_Intro;

public class Ejercicio1 {
	
	/*Programa java que realice lo siguiente: declarar una variable N de tipo int, una
variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuaci�n muestra por pantalla: El valor de cada variable, la suma de N + A, la
diferencia de A - N, el valor num�rico correspondiente al car�cter que contiene la
variable C*/

	public void uno() {
		
		System.out.println("\nEJERCICIO 1\n");
		int N = 10;
		double A = 2.10;
		char C = 'c';
		
		System.out.println("N es: " +N+" A es: "+A+" y C es: "+C);
		System.out.println("N y A suman: " +(N+A));
		System.out.println("N - A es: "+(N-A));
		System.out.println("C equivale al n�mero: "+(int)(C)+"\n\n");

	}

}
