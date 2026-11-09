package practicas;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaracion de variables
		int opcion=1;
		int suma=0;
		
		System.out.println("=================Menú=================");
		System.out.println("1.- Mostrar los numeros del 1 al 5");
		System.out.println("2.- Calcular la suma del 1 al 5");
		System.out.println("0.- Salir");
		System.out.println("======================================");
		
		switch (opcion) {
		case 1:
			System.out.println("Has elegido la opcion 1");
			System.out.println("=======================================");
			for (int i = 0; i <= 5; i++) {	
				System.out.println("Número: " + i);
				}
			break;
		case 2:
			System.out.println("Has elegido la opcion 2");
			System.out.println("=======================================");
			for (int i = 0; i <= 5; i++) {
					System.out.println("El número: " + i + " se suma a la suma total");
					suma=suma+i;
			}
			System.out.println("=======================================");
			System.out.println("La suma total es: " + suma);
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("ERROR, la opcion introducida no es válida");
		}
	}
	

}
