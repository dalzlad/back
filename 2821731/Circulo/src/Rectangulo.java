
public class Rectangulo {
	//Definir los atributos
	double base;
	double altura;
	//Definir el constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//Definer el método setter
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Definir métodos getter
	public double getBase() {
		return this.base;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	//Métodos adicionales
	public double getArea() {
		double area = 0;
		area = this.base * this.altura;
		return area;
	}
	
	public double getPerimetro() {
		double perimetro = 0;
		perimetro = this.base * 2 + this.altura*2;
		return perimetro;
	}
}