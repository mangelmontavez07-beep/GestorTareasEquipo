package array;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializamos las variables
		
		int[] temperaturas = {-3, 8, 0, -7, 12, 5};
		int minimo=0;
		int maximo=0;
		
		for(int i=0; i<= temperaturas.length-1; i ++) {
			if (minimo>temperaturas[i]) {
				minimo=temperaturas[i];
			}
			if (maximo<temperaturas[i]) {
				maximo= temperaturas[i];
			}
		}
		for(int i=0; i<= temperaturas.length-1; i ++) {
			if (minimo==temperaturas[i]) {
				System.out.println("La temperatura " + temperaturas[i] + " es el minimo que está en la posicion " + (i+1));
			}
			if (maximo==temperaturas[i]) {
				System.out.println("La temperatura " + temperaturas[i] + " es la maxima que está en la posicion " + (i+1));
			}
		}
	}

}
