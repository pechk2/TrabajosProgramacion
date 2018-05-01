//Programa para imprimir todos los dígitos comprendidos entre dos números.

import java.util.Scanner;

public class ejercicio17 {
	
	//Expresión regular para comprobar el error
	static String comprobacionNumero = "([1-9]\\d*|[0]{1})";
	
	//Declaración de variables
	 static String numeroIntroducido;
	 static int numero_a_iterar, numero_a_iterar2;
	
	

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
	
	//Método para imprimir los valores comprendidos entre dos números
	static void valores_comprendidos(int a, int b) {
		System.out.println("Los valores comprendidos entre " + a + " y " + b + " son:\n");
		while(a <= b) {
			
			if(a == b) {
				
				System.out.print("y " + a + "." );
				a += 1;
				
			}else {
				
				System.out.print(a + ", ");
				a += 1;
			}
			
			
		}
	}
	
	//Cuerpo del programa
	static void programa() {
		
		//Captura números introducido
        numeroIntroducido = captura_de_valor();
        numero_a_iterar = Integer.parseInt(numeroIntroducido);
        numeroIntroducido = captura_de_valor();
        numero_a_iterar2 = Integer.parseInt(numeroIntroducido);
        
        
        if(numero_a_iterar > numero_a_iterar2) {
        	programa();
        }else {
        	valores_comprendidos(numero_a_iterar, numero_a_iterar2);
        }
        
		
	}

	public static void main(String[] args) {
		
				//Bienvenida y llamada al programa
				System.out.println("A continuación se le demandará que introduzca dos veces un número entero(recuerde que el primero ha de ser menor al segundo que introduzca).");
				
				programa();

	}

}
