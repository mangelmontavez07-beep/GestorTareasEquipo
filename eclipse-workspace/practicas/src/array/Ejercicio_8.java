package array;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializacion de variables
		
		int[] array_notas = new int[5];
        Scanner leer = new Scanner(System.in);
        double suma=0.0;
		int minimo=10;
		int maximo=0;
		int contador_aprobado=0;
		int contador_suspenso=0;
		int contador_media=0;
        
        for (int i = 0; i < array_notas.length; i++) {
        	int nota; 
            boolean notaValida = false;

            do {
                System.out.print("Escribe una nota para la posicion " + (i + 1) + ": ");
                nota = leer.nextInt(); 

                if (nota <= 10 && nota >= 0) {
                    array_notas[i] = nota;
                    notaValida = true;    
                } else {
                    System.out.println("ERROR, debe estar entre 10 y 0");
                }
            } while (!notaValida);
        }

        leer.close();
       
        System.out.println("Las notas se han introducido correctamente:");
        
        for(int i=0; i<= array_notas.length-1; i ++) {
        	
        	if(array_notas[i]>=5) {
        		contador_aprobado+=1;
        	}else {
        		contador_suspenso+=1;
        	}
        	
			if (minimo>array_notas[i]) {
				minimo=array_notas[i];
			}
			if (maximo<array_notas[i]) {
				maximo= array_notas[i];
			}
		}
        
        
        for (int i = 0; i < array_notas.length; i++) {
        	System.out.print(array_notas[i] + " ");
        	suma+=array_notas[i];
        }
        
		System.out.println("");
		System.out.println("La media total de la clase es: " + (suma/array_notas.length));
		
		
		for(int i=0; i<= array_notas.length-1; i ++) {
			if (minimo==array_notas[i]) {
				System.out.println("La nota " + array_notas[i] + " es el minimo que está en la posicion " + (i+1));
			}
			if (maximo==array_notas[i]) {
				System.out.println("La nota " + array_notas[i] + " es la maxima que está en la posicion " + (i+1));
			}
		}
		
		for (int i = 0; i < array_notas.length; i++) {
			if (array_notas[i]>(suma/array_notas.length)) {
				contador_media+=1;
			}
		}
		
		System.out.println("Hay " + contador_aprobado + " aprobados en la clase");
		System.out.println("Hay " + contador_suspenso + " suspensos en la clase");
		System.out.println("Hay " + contador_media + " alumnos que seuperan la media");
	}

}
