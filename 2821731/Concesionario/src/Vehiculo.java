
public class Vehiculo {
	// 1. Definir los atributos de la clase
	String placa;
	String color;
	int modelo;
	int capacidad;
	
	//2.Definir el constructor de la clase
	Vehiculo(String placa, String color, int modelo, int capacidad){
		this.placa = placa;
		this.color = color;
		this.modelo = modelo;
		this.capacidad = capacidad;
	}
	
	//3.Métodos SET.Set permite asignar
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	//4. Definir los métodos get. Get permite obtener
	//EL get inicia con el tipo de datos
	public String getPlaca() {
		return this.placa;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getModelo() {
		return this.modelo;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	//Agregar otros métodos
	public void registrarVehiculo() {
		System.out.println("El vehículo se registró exitosamente");
	}
	
	public void insertarVehiculo() {
		System.out.println("El vehículo se insertó exitosamente");
	}
	
	public void consultarVehiculo() {
		System.out.println("El vehículo se encuentra en la base de datos");
	}
	
	public void actualizarVehiculo() {
		System.out.println("El vehículo se actualizó correctamente");
	}
	
	public void cambiarEstadoVehiculo() {
		System.out.println("El vehículo se cambió de estado correctamente");
	}
	
	@Override
	public String toString() {
		return "Vehiculo\n placa:"+this.placa+
				"\n color: " + this.color +
				"\n modelo: " + this.modelo +
				"\n capacidad: "+ this.capacidad;
	}
}
