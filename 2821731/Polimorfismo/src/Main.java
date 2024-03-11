import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ejemplo Polimorfismo
		Scanner leer = new Scanner(System.in);
		Calculadora calculadora1 = new Calculadora();
		System.out.println("Calculadora\n"
				+ "1. Sumar 2 números\n"
				+ "2. Sumar 3 números"
				+ "\n9. Salir");
		String opcion = leer.nextLine();
		while(!opcion.equalsIgnoreCase("9")) {
			switch(opcion) {
			case "1":
				System.out.println("La suma de 2 números es: "+calculadora1.Sumar(7.0, 8.0));
				break;
				
			case "2":
				System.out.println("La suma de 3 números es: "+calculadora1.Sumar(7.0, 8.0, 23.3));
				break;
				
			default:
				
				break;
			}
			
			System.out.println("Calculadora\n"
					+ "1. Sumar 2 números\n"
					+ "2. Sumar 3 números"
					+ "\n9. Salir");
			
			opcion = leer.nextLine();
			
		}
		
		System.out.println("Fin del algoritmo");

	}

}
