//Programa de encriptado de mensajes Julio César

public class ejercicio32 {
	//Constantes
	static String [] ABECEDARIO = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	static int MEDIDA_PALO = (int) (Math.floor(Math.random() * 15 + 1));
	
	//Función de encriptación sin método replace para evitar sucesivos desplazamientos
	static String encriptadora(String a) {
		//Declaración de variables
		
		String mensaje_encriptado = "";
		int contador_espacios = 0;
		
		//Comprobación letra por letra 
		for(int i = 0; i < a.length(); i++) {
			contador_espacios = 0;
			
			//Comparación de cada subcadena con cada letra del abecedario
			for(int j = 0; j < ABECEDARIO.length; j++) {
				
				if(i + 1 < a.length()) {
					//Manejo de espacios
					if(a.substring(i, i + 1).equals(" ") && contador_espacios == 0) {
						
						mensaje_encriptado += " ";
						contador_espacios += 1;
						
					}else {
						//Encriptación con aritmética modular
						if(a.substring(i, i + 1).equalsIgnoreCase(ABECEDARIO[j])) {
							
							mensaje_encriptado += ABECEDARIO[(j + MEDIDA_PALO) % 27];
						
					}
						
					}
					
					
				}else {
					//Manejo de última letra para evitar exepción de íncide
					if(a.substring(i).equalsIgnoreCase(ABECEDARIO[j])) {
						
						mensaje_encriptado += ABECEDARIO[(j + MEDIDA_PALO) % 27];
					
				}
			
					}
				}
			
		}
		return mensaje_encriptado;
	}

	public static void main(String[] args) {
		
		//Declaración de variables
		String frase_introducida = "";
		
		//Aglutinamiento de palabras introducidas
		for(int i = 0; i < args.length; i++) {
			frase_introducida += args[i] + " ";
		}
		
		//Eliminación de espacios innecesarios
		frase_introducida = frase_introducida.trim();
		
		//Encriptamiento
		frase_introducida = encriptadora(frase_introducida);
		
		//Salida del programa
		System.out.println("El mensaje encriptado queddaría tal que así: " + frase_introducida + ". El desplazamiento es : " + MEDIDA_PALO);
		
	}

}
