package arrgelos;

import java.util.Scanner;

public class arreglos {

	public static void main(String[] args) {
		//Ejemplo de Array
		//Solicitar 10 edades por teclado y almacenarlas en un array
		//Array: Estructura de datos que se almacena en memoria
		//Array: Arreglo de datos
		//Array: Variable de variables.
		//para definir tipo dato nombre_array[];
		//edades.length = Devuelve el tamaño del array
		Scanner leer = new Scanner(System.in);
		int edades[] = new int[5]; //Creación de array
		//LLenado del array
		for(int i = 0;i<edades.length;i++) {
			System.out.println("Ingrese edad");
			edades[i] = leer.nextInt();
		}
		//Impresión del array
		
		System.out.println("Las edades ingresadas son:");
		for(int i = 0; i<edades.length; i++) {
			System.out.println("La edad " + i + " es: "+ edades[i]);
		}
		
		//Imprimir las edades de la última a la 
		//primera posición
		System.out.println("Impresión de la última a la primera posición:");
		for(int i = edades.length-1; i>=0; i--) {
			System.out.println("La edad " + i + " es: "+ edades[i]);

		}
		
		//Calcular el promedio de edades
		//Calcular cantidad de mayores de edad
		//Calcular cantidad de menores de edad
		
		System.out.println("Estadísticas:");
		double promedio = 0;
		int mayoresEdad = 0, menoresEdad = 0;
		for(int i = edades.length-1; i>=0; i--) {
			promedio = promedio + edades[i];
			
			//Contar mayores de edad
			if(edades[i] >= 18) {
				mayoresEdad++;//Incremento de 1 en 1. mayoresEdad = mayoresEdad + 1
			}
			else {
				menoresEdad++;
			}
		}
		promedio = promedio / edades.length;
        //menoresEdad = edades.length - mayoresEdad
		System.out.println("El promedio es: "+promedio);
		System.out.println("Mayores de edad: "+mayoresEdad);
		System.out.println("Menores de edad: "+menoresEdad);
		leer.close();
	}
	
	/*Relice un algoritmo que permita ingresar
	 *10 temperaturas y determine cuántas
	 *son positivas, cuántas negativas, cuántas iguales a 0
	 *promedio de positivas, promedio negativas
	 */
	
	double temperaturas[] = new double[10];
	int positivas =0, negativas = 0, cero = 0;
	double promedioPositivas = 0, promedioNegativas = 0;
	//Scanner
	
	//Ciclo
		//Dentro del ciclo solicitar temperaturas, leer
	for(int i = 0; i < 10; i++) {
		System.out.println("Digite una temperatura");
		temperatura[i] = leer.nextDouble();
	}
	
	
	
	

}
