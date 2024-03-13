/*
 Una clase abstracta es un concepto en 
 programación orientada a objetos (OOP) 
 que se utiliza para definir una plantilla o 
 modelo para otras clases. 
 A diferencia de una clase regular, 
 una clase abstracta no puede ser instanciada directamente. 
 En su lugar, se utiliza como base para crear subclases que 
 heredan sus características y métodos.
 */

public abstract class Persona {
	int documento;
	String nombres;
	String apellidos;
	
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getDocumento() {
		return this.documento;
	}
	
	public String getNombres() {
		return this.nombres;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
		
	abstract void Registrar();
	abstract void Modificar();
	abstract void Eliminar();
	abstract void Consultar();
}
