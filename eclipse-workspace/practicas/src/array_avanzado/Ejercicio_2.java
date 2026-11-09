package array_avanzado;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializacion de variables
		
		int[] datos = {4, 2, 4, 7, 2, 4, 9, 7};

		for (int i = 0; i < datos.length; i++) {

			for (int j = i + 1; j < datos.length; j++) {
				if (datos[i] == datos[j]) {
					continue;
				}
			}
		}		
	}

}
