import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("******Concesionario******");
		
		//Instanciar la clase vehículo: 
		//Crear un objeto: Espacio reservado en la memoria
		String placa = "";
		String color = "";
		int modelo;
		int capacidad;
				
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la placa");
		placa = leer.next();
		
		System.out.println("Ingrese el color");
		color = leer.next();
		
		System.out.println("Ingrese el modelo");
		modelo = leer.nextInt();
		
		System.out.println("Ingrese la capacidad");
		capacidad = leer.nextInt();
		
		Vehiculo vehiculo1 = new Vehiculo(placa, color, modelo, capacidad);
		System.out.println(vehiculo1);
		
		//Llamar métodos de la clase vehiculo
		vehiculo1.registrarVehiculo();
		vehiculo1.actualizarVehiculo();
		vehiculo1.consultarVehiculo();
		vehiculo1.cambiarEstadoVehiculo();
		
		Carro carro1  = new Carro("GOD122","VERDE", 333, 7, 4);
		System.out.println(carro1);
				
		leer.close(); //Cierra el scanner
		
		
		
	}

}
