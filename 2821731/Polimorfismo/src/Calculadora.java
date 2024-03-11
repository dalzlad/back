
public class Calculadora {
	Calculadora(){//Constructor vacío
	}
	
	public double Sumar(double numero1, double numero2) {
		double suma = numero1 + numero2;
		return suma;
	}
	
	public double Sumar(double numero1, double numero2, double numero3) {
		double suma = numero1 + numero2 + numero3;
		return suma;
	}
	
	public double Restar(double numero1, double numero2) {
		double resta = numero1 - numero2;
		return resta;
	}
	
	public double Restar(double numero1, double numero2, double numero3) {
		double resta = numero1 - numero2 - numero3;
		return resta;
	}
}
