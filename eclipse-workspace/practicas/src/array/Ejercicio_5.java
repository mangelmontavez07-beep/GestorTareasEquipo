package array;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializamos las variables
		
		int[] numeros = {4, -2, 0, 7, -5, 8, 0, 3};
		int contador_positivos=0;
		int contador_negativos=0;
		int contador_cero=0;
		int contador_pares=0;
	
		for(int i=0; i<= numeros.length-1; i ++) {
			if (numeros[i]<0) {
				contador_negativos+=1;
			}else if (numeros[i]>0) {
				contador_positivos+=1;
			}else if (numeros[i]==0) {
				contador_cero+=1;
			}
			
			if (numeros[i]%2==0 && numeros[i] !=0) {
				contador_pares+=1;
			}
			
		}
		System.out.println("Existen " + contador_cero + " veces 0 en el array");
		System.out.println("Existen " + contador_pares + " veces numeros pares en el array");
		System.out.println("Existen " + contador_positivos + " veces numeros positivos en el array");
		System.out.println("Existen " + contador_negativos + " veces numeros negativos en el array");
	
	}

}
