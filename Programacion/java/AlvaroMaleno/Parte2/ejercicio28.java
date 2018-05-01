

public class ejercicio28 {

	public static void main(String[] args) {
		
		//Declaración de variables
		String[] vocales = {"a", "e", "i", "o", "u", "á", "é","í", "ó", "ú", "A", "E", "I", "O", "U", "Á", "É", "Í", "Ó", "Ú", "à",  "è", "ò", "À", "È", "Ò"};
		String resultado = "";
		int iterador = 0;
		
		//Selección de palabra a comprobar
		for(int i = 0; i < args.length; i++) {
			
			//Selección de letra a comparar
			for(int j = 0; j < args[i].length(); j++) {
				
				//Comparación de letra con vocal
				for(int z = 0; z < vocales.length; z++) {
					
					//Contador de vocal(si es vocal el contador sube)
					if(args[i].substring(j, j + 1).equals(vocales[z]) == true) {
						iterador = iterador + 1;
					}
					
				}
				//Solamente si no es vocal se añade al resultado
				if(iterador == 0) {
					
					resultado += args[i].substring(j, j + 1);
					
				}iterador = 0;
				//Introducción de espacios entre cada palabra
				if(j + 1 == args[i].length()) {
					resultado += " ";
				}
			}
		}
		//Impresión por pantalla del resultado
		System.out.println(resultado.substring(0, resultado.length() - 1));
	}

}
