package array;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializamos la variable
		
		String[] nombres = {"Ana", "Luis", "Marta", "Pablo", "Sara"};
		
		for(int i=0; i<= nombres.length-1; i ++) {
				System.out.println("En la posicion " + i+ " del arrary está este nombre : " + nombres[i]);
		}
		
		System.out.println("=============================================================");
		
		for(int i=nombres.length-1; i>=0 ; i --) {
			System.out.println("En la posicion " + i+ " del arrary está este nombre : " + nombres[i]);
		}
		
	}

}
