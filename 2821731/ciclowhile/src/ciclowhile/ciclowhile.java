package ciclowhile;

import java.util.Scanner;

public class ciclowhile {

	public static void main(String[] args) {
		//Solicitar un número entero mientras no se digite
		//el -99. Hallar e imprimir el valor máximo ingresado
		//Calcular e imprimir la cantidad de números ingresados
		//Calcular e imprimir cantidad de positivos
		//Calcular e imprimir cantidad de negativos
		//Calcular e imprimir suma de positivos
		Scanner lectura = new Scanner(System.in);
		int numero = 0, numeroMayor = 0;
		System.out.println("Inicio del algoritmo");
		System.out.println("Apreciado usuario digite un número entero");
		numero = lectura.nextInt();//Lectura de la variable
		numeroMayor = numero;
		while( numero != -99) {
			System.out.println("Apreciado usuario digite un número entero");
			numero = lectura.nextInt();//Lectura de la variable
			if(numeroMayor < numero) {//Hallar el número mayor
				numeroMayor = numero;
			}
		}
		System.out.println("El número mayor es: "+numeroMayor);
		System.out.println("Fin del algoritmo");
	}
	
	/*
	 Realice un algoritmo que lea una opción entre:
	 1.Calcular e imprimir el doble de un número
	 2.Imprimir números impares del 10 al 30
	 */

}

/*
7
5
20
1
-99
 */
