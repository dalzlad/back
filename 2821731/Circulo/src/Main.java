
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancias las clases
		//Objeto: Instancia de una clase
		/*
		Circulo circulo1 = new Circulo(1);
		System.out.println("El área es: "+circulo1.getArea());
		System.out.println("El perímetro es: "+circulo1.getPerimetro());

		Circulo circuloXYZ = new Circulo(1000);
		System.out.println("El área es: "+circuloXYZ.getArea());
		System.out.println("El perímetro es: "+circuloXYZ.getPerimetro());
		*/
		
		//Instanciar la clase rectángulo
		Rectangulo rectangulo1 = new Rectangulo(10,2);
		System.out.println("El área del rectángulo es:"+rectangulo1.getArea());
		System.out.println("El perímetro del rectángulo es:"+rectangulo1.getPerimetro());
		System.out.println("La base es: "+rectangulo1.getBase());
		rectangulo1.setBase(100);
		System.out.println("El área del rectángulo es:"+rectangulo1.getArea());

}

}
