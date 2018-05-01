//Programa para factorizar un número

import java.util.Scanner;

public class ejercicio14 {
	
	//Expresión regular para comprobar el error
	static String comprobacionNumero = "([1-9]\\d*)";
	
	

	//Creación del objeto escáner
	static Scanner sc = new Scanner(System.in);
	
	
	//Petición de valores
	static String captura_de_valor() {
			
		String numeroIntroducido;
			
			do{ 
	        	
				System.out.println("Introduzca un número entero(sin ceros a la izquierda ni decimales y mayor a 0):  ");
					
				numeroIntroducido =  sc.nextLine();
	  
	            
				}while(!numeroIntroducido.matches(comprobacionNumero));
			
			return numeroIntroducido;
		}
		
		//Cálculo del factorial con recursividad. Retorno tipo double para ampliar el ámbito de resultados posibles
		static double factorizar(int n) {
			
			if(n == 0) {
				return 1;
				
			}else {
				return  n * factorizar(n -1);
			}
		}
		
		
	public static void main(String[] args) {
		
		//Declaración de variables
		String numeroIntroducido;
		
		//Captura número introducido
        numeroIntroducido = captura_de_valor();
        int numero_a_factorizar = Integer.parseInt(numeroIntroducido);
        
        //Llamada a la factorización e impresión por pantalla del resultado
		System.out.println("El factorial de " + numeroIntroducido + " es: " + factorizar(numero_a_factorizar));

	}

}
