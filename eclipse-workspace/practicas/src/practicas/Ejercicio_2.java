package practicas;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iniciamos una variable
		float compra=2;
		
		if (compra >=0 && compra<30) {
			System.out.println("El gasto de envío es 5€");
		}else if (compra >=30 && compra<60) {
			System.out.println("El gasto de envío es 2€");
		}else if (compra>=60) {
			System.out.println("El envío es gratuito");
		}else {
			System.out.println("Lo introduce no es un numero valido");
		}
	}

	}

