//Programa que analiza una palabra para determinar su palindromía

public class ejercicio30 {
	
	//Función que invierte el orden de un String
		static String invertidor(String a){
			
			String b = "";
			
			for(int i = 0; i < a.length(); i++) {
				
				b += a.substring(a.length() - i - 1, a.length() - i);
				
			}
			return b;
		}

	public static void main(String[] args) {
		//Declaración de variables
		String iterador = "";
		String palabra = "";
		String palabra_invertida = "";
		String resultado = "";
				
		//Agrupación de argumentos
		for(int i = 0; i < args.length; i++) {
			
					palabra += args[i] + " ";
					
				}
		
		//Extracción de espacios
		for(int i = 0; i < palabra.length(); i++) {
			
			if(palabra.substring(palabra.length() - i - 1, palabra.length() - i).equals(" ") == false) {
				
				iterador += palabra.substring(palabra.length() - i - 1, palabra.length() - i);
			}
			
		}
		
		
		//Inversión de la palabra
		palabra_invertida = invertidor(iterador);
		
		//Comprobador de la igualdad en ambos sentidos
		resultado = iterador.equalsIgnoreCase(palabra_invertida)? resultado = "La palabra " + palabra + " es palíndroma." : "La palabra " + palabra + " no es palíndroma.";
		
		//Resultado del programa
		System.out.println(resultado);
	}

}
