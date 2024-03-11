
public class Circulo {
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getArea() {
		double area = 2 * Math.PI* this.radio;
		return area;
	}
}
