//Programa para comprobar la paridad de un número introducido por el usuario

import java.util.Scanner;

public class ejercicio5 {
	//Comprobación de errores mediante expresión regular(sólo números con un máximo de 12 decimales
		static String comprobacionNumero = "(\\-?[1-9]\\d*)";
		
		
	public static void main(String[] args) {
		
		//Creación del objeto escáner
		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		String numeroIntroducido, salida;
		int numeroExaminado;
		        
		 //Petición y captura del número introducido.
		do{ 
		        	
		System.out.println("Introduzca un número real(sin ceros a la izquierda):  ");
		            numeroIntroducido =  sc.nextLine();
		  
		            
		     }while(!numeroIntroducido.matches(comprobacionNumero));
		
		//Cadena a entero
		numeroExaminado = Integer.parseInt(numeroIntroducido);
		
		//Comprobación de paridad
		salida = numeroExaminado % 2 == 0 ? salida = numeroExaminado + " es par." : numeroExaminado + " es impar.";
		
		//Salida del programa
		System.out.println(salida);
		

	}

}
