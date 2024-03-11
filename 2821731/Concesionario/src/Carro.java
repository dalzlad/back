
public class Carro extends Vehiculo {
	int numeroPuertas;
	public Carro(String placa, String color, int modelo, int capacidad, int numeroPuertas) {
		super(placa, color, modelo, capacidad);//Hereda atributos de la superclase
		this.numeroPuertas = numeroPuertas;
	}
	
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	public int getNumeroPuertas() {
		return this.numeroPuertas;
	}
	
	@Override
	public String toString() {
		return "Carro\n placa:"+this.placa+
				"\n color: " + this.color +
				"\n modelo: " + this.modelo +
				"\n capacidad: "+ this.capacidad +
				"\n numero puertas: "+ this.numeroPuertas;
	
	}
}