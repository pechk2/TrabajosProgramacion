//Programa para contar el número de cifras de un guarismo comprendido entre 0 y 99.999

import java.util.Scanner;

public class ejercicio8 {
	//Declaración de variables 
	static String numero = "[1-9]\\d*";
	static Scanner entradaNumero = new Scanner(System.in);
	static String numeroIntroducido;
	
	//Rutina para comunicar un error
	public static void error(String mensaje) {
		String mensajeTemporal;
		mensajeTemporal = mensaje;
        System.err.println(mensajeTemporal);
        programa();
    }
	
	//Programa principal
	public static void programa() {
		
		//Petición de número al usuario
		System.out.println("Por favor, introduzca un número entero comprendido entre 0 y 99.999: ");
		numeroIntroducido = entradaNumero.nextLine();
		
		//Comprobación de errores
		if (!numeroIntroducido.matches(numero)) error("El argumento introducido ha de ser numérico y mayor a 0.");
		else if ((Integer.parseInt(numeroIntroducido) > 99999) | (Integer.parseInt(numeroIntroducido) < 0) ) error("El número introducido no está comprendido entre los valores precisados.");
		
		//Salida del programa
		else; System.out.println("El número introducido tiene " + numeroIntroducido.length() + " cifras.");
		System.exit(0);
	}

	public static void main(String[] args) {
		
		//Llamada e la función que contiene el programa
		programa();
		
		
		
		

	}

}
