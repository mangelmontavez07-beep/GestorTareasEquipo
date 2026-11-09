package array;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializamos la varibles
		
		int[] valores = {7, 12, 4, 9, 6};
		double suma= 0.0;
		double media=0.0;
		int contador=0;
		
		for(int i=0; i<= valores.length-1; i ++) {
			suma+=valores[i];
		}
		System.out.println("La suma es: " + suma);
		media=suma/valores.length;
		System.out.println("La media es: " + media );
		
		for(int i=0; i<= valores.length-1; i ++) {
			if (media<valores[i]) {
				contador+=1;
			}
		}
		System.out.println("Existen "+ contador + " valores por encima de la media");
	}

}
