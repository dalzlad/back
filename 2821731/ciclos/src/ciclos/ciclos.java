package ciclos;

import java.util.Scanner;

public class ciclos {

	public static void main(String[] args) {
		// Ciclo FOR
		//Empleando el ciclo for imprimir los números
		//enteros del 1 al 10.
		for( int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//Calcular e imprimir la suma de los 
		//números del 1 al 100
		
		//Calcular e imprimir el factorial
		//de un número entero.
		//Ejemplo del 5 es 120.
		
		/*
		 Realice un algoritmo que lea un número
		 entero y luego calcule y muestre la
		 tabla de multiplicar
		 Ejemplo:
		 7
		 7 * 1 = 7
		 7 * 2 = 14
		 7 * 3 = 21
		 ....
		 7 * 10 = 70
		 */
		
		/*
		 Realice un algoritmo que lea 10
		 números enteros y calcule y muestre la cantidad
		 de positivos y cantidad de pares ingresados
		 */
		Scanner lectura = new Scanner(System.in);
		int numero = 0;
		int contadorPositivos = 0;
		int contadorPares = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite un número entero");
			numero = lectura.nextInt();
			if( numero > 0) {
				contadorPositivos = contadorPositivos + 1;
			}
			
			if( numero % 2 == 0) {
				contadorPares = contadorPares + 1;
			}
		}
		System.out.println("Cantidad de Positivos: "+contadorPositivos);
		System.out.println("Cantidad de Pares: "+contadorPares);
	}

}
