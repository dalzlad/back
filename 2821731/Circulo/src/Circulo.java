
public class Circulo {
	//Definición de atributos
	double radio;
	//Definir el constructor de la clase
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//Definir métodos setter
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//Definir método getter
	public double getRadio() {
		return this.radio;
	}
	
	//Crear el método para calcular el Área
	public double getArea() {
		double area = 0;
		area = 3.1416 * this.radio * this.radio;
		return area;
	}
	
	//Crear el método para calcular el Perímetro
	public double getPerimetro() {
		double perimetro = 0;
		perimetro = 2 * 3.1416 * this.radio;
		return perimetro;
	}
}
