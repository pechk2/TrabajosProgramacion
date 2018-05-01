
public class ejercicio26 {

	public static void main(String[] args) {
		//Declaracion de variables
		String palabraIntroducida1, palabraIntroducida2;
		String mensaje = "";
		
		//Captura de argumentos
		palabraIntroducida1 = args[0];
		palabraIntroducida2 = args[1];
		
		//Comprobacion logica
		if(palabraIntroducida1.length() == palabraIntroducida2.length()) {
			
			mensaje = "Ambas palabras son iguales";
			
		}else {
			
			mensaje = (palabraIntroducida1.length() > palabraIntroducida2.length())? mensaje = "La palabra " + palabraIntroducida1 + " es la de mayor longitud." : "La palabra " + palabraIntroducida2 + " es la de mayor longitud.";
		}
	//Salida del programa	
	System.out.println(mensaje);	
	}

}
