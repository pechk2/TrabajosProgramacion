//Programa que evalúa la nota de un valor introducido por el usuario

import java.util.Scanner;

public class ejercicio9 {
	
	//Declaración de variables 
		static String numero = "[0-9]{1,2}";
		static Scanner entradaNumero = new Scanner(System.in);
		static String numeroIntroducido;
		static int nota;
		
		//Rutina para comunicar un error
		public static void error(String mensaje) {
			String mensajeTemporal;
			mensajeTemporal = mensaje;
	        System.err.println(mensajeTemporal);
	        programa();
	    }
		
		public static void programa() {
			
			//Petición de número al usuario
			System.out.println("Por favor, introduzca un número entero comprendido entre 0 y 10: ");
			numeroIntroducido = entradaNumero.nextLine();
			
			//Comprobación de errores
			if (!numeroIntroducido.matches(numero)) error("El argumento introducido ha de ser numérico y mayor a 0.");
			else if ((Integer.parseInt(numeroIntroducido) > 10) | (Integer.parseInt(numeroIntroducido) < 0) ) error("El número introducido no está comprendido entre los valores precisados.");
			
			//Salida del programa
			else{
				
				nota = Integer.parseInt(numeroIntroducido);
				
				if(nota <= 4) {
					System.out.println(nota + " es un insuficiente.");
					System.exit(0);
				}
				else if(nota == 5) {
					
					System.out.println(nota + " es un suficiente.");
					System.exit(0);
				}
				else if(nota == 6) {
					
					System.out.println(nota + " es un bien.");
					System.exit(0);
					
				}
				else if(nota < 9){
					
					System.out.println(nota + " es un notable.");
					System.exit(0);
					
				}
				else {
					
					System.out.println(nota + " es un sobresaliente.");
					System.exit(0);
					
				}
				}
			}
			
		

	public static void main(String[] args) {
		
		//Llamada e la función que contiene el programa
		programa();
		

	}

}
