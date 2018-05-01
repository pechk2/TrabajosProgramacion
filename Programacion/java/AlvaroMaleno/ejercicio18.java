//Programa para encontrar el máximo y el mínimo de entre tres valores introducidos por el usuario

import java.util.Scanner;

public class ejercicio18 {
	
		//Expresión regular para comprobar el error
		static String comprobacionNumero = "([1-9]\\d*|[0]{1})";
		
		//Declaración de variables. Se emplean variables goblales para evitar la acumulación de las mismas en caso de necesitarse el reinicio del programa.No intenten lo mismo en casa.
		 static String numeroIntroducido;
		 static int numero_a_iterar, numero_a_iterar2, numero_a_iterar3;
		
		

		//Creación del objeto escáner
		static Scanner sc = new Scanner(System.in);
		
		
		//Petición de valores
		static String captura_de_valor() {
				
			String numeroIntroducido;
				
				do{ 
		        	
					System.out.println("Introduzca un número entero(sin ceros a la izquierda ni decimales):  ");
						
					numeroIntroducido =  sc.nextLine();
		  
		            
					}while(!numeroIntroducido.matches(comprobacionNumero));
				
				return numeroIntroducido;
			}
		
		//Función para evaluar el dígito mayor
		static int max(int a, int b, int c) {
			int max;
			
			max = a > b  ? max = a : b;
			max = max > c ? max = max : c;
			return max;
			
			
		}
		
		//Función para evaluar el dígito menor
		static int min(int a, int b, int c) {
			int min;
			
			min = a < b  ? min = a : b;
			min = min < c ? min = min : c;
			
			return min;
		}
		
		//Cuerpo del programa
		static void programa() {
			
			//Variables a emplear
			int maxim, minim;
			
			//Captura números introducidos
	        numeroIntroducido = captura_de_valor();
	        numero_a_iterar = Integer.parseInt(numeroIntroducido);
	        numeroIntroducido = captura_de_valor();
	        numero_a_iterar2 = Integer.parseInt(numeroIntroducido);
	        numeroIntroducido = captura_de_valor();
	        numero_a_iterar3 = Integer.parseInt(numeroIntroducido);
	        
	        //Llamada a las funciones que habrán de calculcar el máximo y el mínimo
	        maxim = max(numero_a_iterar, numero_a_iterar2, numero_a_iterar3);
	        minim = min(numero_a_iterar, numero_a_iterar2, numero_a_iterar3);
	        
	        //Muestra por pantalla el resultado
	        System.out.println("El número mayor entre " + numero_a_iterar + ", " + numero_a_iterar2 + " y " + numero_a_iterar3 + " es:\n" + maxim + "." );
	        System.out.println("Por otro lado el menor entre " + numero_a_iterar + ", " + numero_a_iterar2 + " y " + numero_a_iterar3 + " es:\n" + minim + "." );
		}

	public static void main(String[] args) {
		
		//Bienvenida e inicio del programa
		System.out.println("A continuación se le demandará tres veces que introduzca un número entero.\n");
		
		programa();

	}

}
