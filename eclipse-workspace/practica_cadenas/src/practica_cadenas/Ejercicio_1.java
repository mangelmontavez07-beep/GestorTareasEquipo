package practica_cadenas;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Radiografía de una cadena	
		//iniciamos y asignamos las variables
		
		String cadena_entrada="";
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Escribe una cadena: ");
		cadena_entrada=leer.nextLine();
		leer.close();
		
		if (cadena_entrada.isEmpty()==true) {
		System.out.println("La cadena está vacía, por tanto no se introducido una cadena");
		}else {
			System.out.println("La cadena: " + "'"+ cadena_entrada+"'"+ " tiene está longitud: "+cadena_entrada.length());
			System.out.println("La cadena: " + "'"+ cadena_entrada+"'"+ " tiene como primer caracter: "+ cadena_entrada.charAt(0));
			System.out.println("La cadena: " + "'"+ cadena_entrada+"'"+ " tiene como último caracter: "+cadena_entrada.charAt(cadena_entrada.length()-1));
		}
		
	}

}
