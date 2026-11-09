package array;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializamos las variables
		
		int[] numeros = {6, 14, 9, 2, 2, 18};
		int contador=0;
		int usuario=0;
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Escribe un numero para buscar en la lista: ");
		usuario=leer.nextInt();
		leer.close();
		
		System.out.println("====================================================================");
		
		for(int i=0; i<= numeros.length-1; i ++) {
			if (usuario == numeros[i]) {
				System.out.println("El numero introducido aparece en el array en la posicion " + (i+1));
				contador+=1;
			}
		}
		if (contador==0) {
			System.out.println("El numero introducido no aparece en la lista");
		}else {
			System.out.println("El numero introducido aparece en la lista " + contador + " veces");
		}
	}

}
