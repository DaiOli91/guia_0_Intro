package guia_0_Intro;

public class Ejercicio4 {
	/*Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
cada una. A continuaci�n realiza las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.*/

	public void cuatro() {
		
		System.out.println("\nEJERCICIO 4\n");
		int A = 1;
		int B = 3;
		int C = 5;
		int D = 7;
		
		System.out.println("A es: " +A+" B es: "+B+" C es: "+C+" y D es: "+D);
		
		int aux = 0;
		
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;
		
		System.out.println("A es: " +A+" B es: "+B+" C es: "+C+" y D es: "+D+"\n\n");

	}

}
