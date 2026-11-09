package array;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializamos las variables
		int[] original = {10, 20, 30, 40, 50};
		int[] inverso = new int[5];
		
		System.out.print ("La lista original es: ");
		for(int i=0; i<= original.length-1; i ++) {
			System.out.print(original[i] + " ");
		}
		System.out.println("");
		
		System.out.print ("La lista invertida es: ");
		for(int i=original.length-1; i>=0 ; i --) {
			inverso[i]= original[i];
			System.out.print(inverso[i] + " ");
			
		}
		System.out.println("");
	}
	

}
