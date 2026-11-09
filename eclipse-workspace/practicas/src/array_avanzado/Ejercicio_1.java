package array_avanzado;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializacion de variables
		
		int[] numeros = {8, 15, 10, 15, 3, 6};
		int maximo=0;
		int contador=0;
		int numero=0;
		int mayor=0;
		boolean existe=false;
		
		for (int i = 0; i < numeros.length; i++) {
			if (maximo<numeros[i]) {
				maximo= numeros[i];
			}
		}
		System.out.println(maximo);
		for (int i = 0; i < numeros.length; i++) {

			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] == numeros[j]) {
					continue;
				}
				else if (numeros[i]!=maximo && numeros[i]>mayor && contador !=2) {
					contador+=1;
					mayor=numeros[i];
				}else if (numeros[i]!=maximo && contador==2 && existe!=true && (numeros[i] <numero || numero==0)) {
					numero=numeros[i];
					existe=true;
				}
				System.out.println(mayor);
				System.out.println(numero);
				System.out.println("==============================");
			}
		}
		if (contador<2) {
			System.out.println("No existen dos valores distintos");
		}else {
			System.out.println("El numero segundo mayor despues del maximo es: " + numero);
		}
	}

}
