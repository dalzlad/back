package cadena;

public class cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recorrer un String e imprir caracter a caracter
		//y contar las vocales
		String frase = "AAA";
		//              012345678...........20
		System.out.println("Longitud de la cadena:"+frase.length());
		int contadorVocales = 0;
		for(int i = 0; i < frase.length(); i++) {
			//System.out.println(frase);
			System.out.println(frase.charAt(i));
			if(frase.toLowerCase().charAt(i) == 'a'||  frase.toLowerCase().charAt(i) == 'e') {
				contadorVocales++;
			}
		}
		System.out.println("Total Vocales"+contadorVocales);
	}

}
