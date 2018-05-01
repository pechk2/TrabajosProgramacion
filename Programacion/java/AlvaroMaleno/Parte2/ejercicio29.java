

public class ejercicio29 {
	
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
		
		//Agrupación de argumentos
		for(int i = 0; i < args.length; i++) {
			iterador += args[i] + " ";
		}
		
		//Salida del programa
		System.out.println(invertidor(iterador).substring(1, invertidor(iterador).length() ));

	}

}
