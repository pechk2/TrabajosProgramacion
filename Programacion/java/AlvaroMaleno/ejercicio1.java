

import java.util.Scanner;

public class ejercicio1 {
	
	//Variables globales que habrán de estar accesibles durante todo el programa y ser sobreescritas cada vez que se ejecute.
	
	static String numero = "[1-9]\\d*"; //Expresión regular para asegurarse que la entrada se corresponde con un número entero.
	static String edadTeclado = "";
	static int edad = 0;
	static Scanner entradaEdad = new Scanner(System.in);
	
	//Función para emitir un mensaje de error concreto y reiniciar el programa.
	
	public static void error(String mensaje) {
		String mensajeTemporal;
		mensajeTemporal = mensaje;
        System.err.println(mensajeTemporal);
        programa();
    }
	
	//Función que ejecuta el programa usando el método Scanner.
	
	public static void programa() {
		System.out.println("Por favor, introduzca su edad: ");
		edadTeclado = entradaEdad.nextLine();
		
		//Comprobación de errores mediante método directo
		
		if (!edadTeclado.matches(numero)) error("El argumento introducido ha de ser numérico y mayor a 0.");
		edad =  Integer.parseInt(edadTeclado);
		
		
		//Salida del programa
		if (edad < 100) {
			
			System.out.println("Tras su próximo cumpleaños usted tendrá: " + (edad + 1) + " años.");
			System.exit(0);
		}else {
			
			System.out.println("No llegará al próximo cumpleaños");
			System.exit(0);
			
		}
		
		
	}
	


	public static void main(String[] args) {
		
		//Llamada a la función que contiene el programa.
		programa();
	}



	

}
