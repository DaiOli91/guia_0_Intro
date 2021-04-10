package guia_0_Intro;

public class Ejercicio7 {
	/*Programa Java que declare una variable C de tipo entero y asignarle un valor. A
continuaci�n mostrar un mensaje indicando si el valor de C es positivo o negativo,
si es par o impar, si es m�ltiplo de 5, si es m�ltiplo de 10 y si es mayor o menor que
100*/

	public void siete() {
		
		System.out.println("\nEJERCICIO 7\n");
		int C = (95);
		int div2 = C % 2;
		int div5 = C % 5;

		System.out.println("A vale: "+C+", que es un n�mero:");
		
		if (C > 0)
		{
			System.out.println("positivo");
		}
		else
		{
			System.out.println("negativo");
		}
		
		if (div2 == 0) {
			
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}
		
		if(div5 == 0) {
			System.out.println("m�ltiplo de 5");
		}
		
		if ((div2 == 0) && (div5 == 0)) {
			System.out.println("m�ltiplo de 10");
		}
		
		if (C < 100) {
			
			System.out.println("y menor que 100\n\n");
		}
		else {
			System.out.println("y mayor que 100\n\n");
		}
			}

}
