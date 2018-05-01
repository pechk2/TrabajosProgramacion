//Programa que muestra el cuadrado, el signo y si es par de una cifra introducida por el usuario y solo finaliza una vez introducido un 0.

import java.util.Scanner;

public class ejercicio11 {
	
	//Comprobación de errores mediante expresión regular(sólo números con un máximo de 12 decimales)
		static String comprobacionNumero = "(\\-?[1-9]\\d*\\.\\d{1,12})|(\\-?0{1}\\.0{1,5}\\d{1,7})|(\\-?0{1}\\.\\d{1,12})|(\\-?[1-9]\\d*)|([0]{1})";
		
		//Variable Global
		static Double numeroEvaluado;
		
		//Creación del objeto escáner
		static Scanner sc = new Scanner(System.in);
		
		static void programa() {
			
			//Declaración de variables
			String numeroIntroducido1;
			
	        //Captura del primero número introducido
	        numeroIntroducido1 = captura_de_valor();
	        System.out.println(numeroIntroducido1);
	        
	        //Evaluar la salida o no del programa
	        if (Double.parseDouble(numeroIntroducido1) == 0.0) {
	        	
	        	System.out.println("Me has pillado...");
	        	
	        	System.exit(0);
	        	
	        }else {
	        	
	        	//Muestra el resultado del programa y lo reinicia
	        	
	        	numeroEvaluado = Double.parseDouble(numeroIntroducido1);
	        	
	        	if (numeroEvaluado % 2 == 0) System.out.println(numeroEvaluado + " es par.");
	        	
	        	System.out.println("Su cuadrado es : " + numeroEvaluado * numeroEvaluado);
	        	
	        	if (numeroEvaluado < 0) {
	        		
	        		System.out.println("Otra cosilla, " + numeroEvaluado + " es negativo.");
	        		
	        	}else {
	        		
	        		System.out.println("Otra cosilla, " + numeroEvaluado + " es positivo.");
	        	}
	        	
	        	delete();
	        	
	        	programa();
	        }
	        }
		
		//Peticion de valores
		static String captura_de_valor() {
			
			String numeroIntroducido;
			
			do{ 
	        	
				System.out.println("Introduzca un número real(sin ceros a la izquierda), decimales(max. 12) empleando un punto por coma:   ");
				numeroIntroducido =  sc.nextLine();
	  
	            
					}while(!numeroIntroducido.matches(comprobacionNumero));
			
				return numeroIntroducido;
			
		 }
		
		//Reinicio de variables
		static void delete() {
			
			numeroEvaluado = 0.0;
		}

	public static void main(String[] args) {
		//Llamada al programa
		programa();		

	}

}
