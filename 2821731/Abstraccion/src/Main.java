
public class Main {

	public static void main(String[] args) {
		// Ejemplo Abstracción
		//Instanciar la clase 
		//Persona persona1 = new Persona();NOOO SE PUEDEE.
		Aprendiz aprendiz1 = new Aprendiz(1111,"IRENE","PANIAGUA");
		aprendiz1.Registrar();
		aprendiz1.Eliminar();
		System.out.println(aprendiz1.getDocumento());
	}

}
