package practica_cadenas;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recorremos el texto
		//Iniciamos y asignamos la variable
		
		String cadena_entrada="";
		int contador=0;
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Escribe una cadena: ");
		cadena_entrada=leer.nextLine();
		leer.close();
		
		System.out.println("===========================================");
		System.out.println("La cadena introducida es: " + cadena_entrada);
		System.out.println("===========================================");
		
		for (int i=0; i<=cadena_entrada.length()-1;i++) {
			System.out.print(cadena_entrada.charAt(i)+"-");
		}
		System.out.println("");
		System.out.println("===========================================");
		
		if (cadena_entrada.contains("a")|| cadena_entrada.contains("A") ) {
			System.out.println("La cadena si contiene la 'a' o la 'A'");
			for (int i=0; i<=cadena_entrada.length()-1;i++) {
				if (cadena_entrada.charAt(i)=='a'|| cadena_entrada.charAt(i)=='A') {
					contador+=1;
					
				}
			}
			System.out.println("Está contenida "+ contador+ " veces");
		}else{
			System.out.println("La cadena NO contiene la 'a' o la 'A'");
		}
	}

}
