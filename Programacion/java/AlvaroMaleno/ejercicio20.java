//Programa para encontar el mínimo y el máximo de entre un conjunto numérico

public class ejercicio20 {
	
	//Expresión regular para comprobar el error
	static String comprobacionNumero = "([1-9]\\d*|[0]{1})";
	
	//Función para evaluar el dígito mayor
	static int max(int [] a) {
		
		int max = 0;
		
		for(int i = 0; i < a.length; i++) {
			max = max > a[i] ? max = max : a[i];
			
		}

		return max;
	}
	
	//Función para evaluar el dígito menor
		static int min(int [] a) {
			
			int min = a[0];
			
			for(int i = 0; i < a.length - 1; i++) {
				
				min = min > a[i] ? min = a[i] : min;
				
			
				
			}

			return min;
		}

	public static void main(String [] args) {
		//Declaración de variables
		int [] conjuntoNumerico = new int [args.length];
		
		//Comprobación de errores que permite mostrar un mensaje.
		for(int i = 0; i < args.length; i++) {
			
			if(!args[i].matches(comprobacionNumero)) {
				System.out.println("Lo lamento. Uno de los números introducidos es erróneo.\nRecuerde que ha de introducir solamente "
						+ "cifras enteras, sin ceros a la izquierda y separadas por un espacio unas de otras");
				System.exit(0);
			}else {
				conjuntoNumerico[i] = Integer.parseInt(args[i]);
				
			}
			
		}
		//Salida del programa
		System.out.println("El número mayor de entre los introducidos es: " +  max(conjuntoNumerico));
		System.out.println("\nEl número menor de entre los introducidos es: " +  min(conjuntoNumerico));
		System.out.println(args.length);
		

	}

}
