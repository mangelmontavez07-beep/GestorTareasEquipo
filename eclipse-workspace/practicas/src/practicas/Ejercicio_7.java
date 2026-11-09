package practicas;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
		

		
		//a) Debe aplicar el descuento solo a menores de 12 años
		System.out.println("===================================");
		System.out.println("Apartado a");
		System.out.println("===================================");
		
		int edad=15;
		int precio=8;
		
		if (edad < 12) {
		    precio = 5;
		    System.out.println(precio);
		}else {
			System.out.println(precio);
		}
		
		//b)  Debe mostrar los números del 1 al 3 y terminar.
		System.out.println("===================================");
		System.out.println("Apartado b");
		System.out.println("===================================");
		
		int i = 1;
		while (i <= 3) {
		    System.out.println(i);
		    i++;
		}
		
		//c) Debe acumular la suma de los números del 1 al 4
		System.out.println("===================================");
		System.out.println("Apartado c");
		System.out.println("===================================");
		
		int suma = 0;
		for (int j = 1; j <= 4; j++) {
		    suma += j;
		}
		System.out.println(suma);
		
	}

}
