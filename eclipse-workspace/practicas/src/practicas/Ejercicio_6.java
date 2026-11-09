package practicas;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
		int limite=10;
		int suma=0;
		
		for (int i = 0; i <= limite; i++) {
			
			if (i%2==0) {
				System.out.println("El número: " + i + " es par, por tanto se suma");
				suma=suma+i;
			}
		}
		System.out.println("=======================================");
		System.out.println("La suma total es: " + suma);
		
		
	}

}
