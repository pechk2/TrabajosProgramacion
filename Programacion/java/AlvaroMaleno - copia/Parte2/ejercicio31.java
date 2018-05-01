//Programa para detectar si un mensaje está escrito por javalandeses.

public class ejercicio31 {

	public static void main(String[] args) {
		
		//Declaración de variables
		String prefijo = "Javalín javalón";
		String sufijo = "javalén len len";
		String palabra_a_examinar = "";
		boolean javalandia = false;
		
		//Aglutinación de palabras
		for(int i = 0; i < args.length; i++) {
			
			palabra_a_examinar += args[i] + " ";
		}
		
		//Comprobación de prefijo y extracción del mismo(sin comas para permitir su captura mediante args)
		if(palabra_a_examinar.indexOf(prefijo) > -1) {
			
			palabra_a_examinar = palabra_a_examinar.substring(prefijo.length());
			
			javalandia = true;
		}
		
		//Comprobación de sufijo y extracción del mismo(sin comas para permitir su captura mediante args)
		if(palabra_a_examinar.indexOf(sufijo) > - 1) {
			
			palabra_a_examinar = palabra_a_examinar.substring(0, palabra_a_examinar.indexOf(sufijo));
			
			javalandia = true;
		}
		
		//Eliminación de espacios innecesarios.
		palabra_a_examinar = palabra_a_examinar.trim();
		
		//Creación de mensaje a mostrar
		String mensaje = (javalandia == true) ? mensaje = "Es dialecto javalandés. Este es el mensaje:  " + palabra_a_examinar : "El mensaje: " + palabra_a_examinar + ", no es javalandés.";
		
		//Impresión de mensaje a usuario
		System.out.println(mensaje);
	}

}
