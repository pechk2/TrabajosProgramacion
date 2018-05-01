//Programa para imprimir por pantalla "eco" tantas vveces como el usuario demande
//Autor: Alvaro Maleno Alferez
import java.util.Scanner;

public class ejercicio16 {
	
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
			
			//Impresion por pantalla de la palabra eco
			static void eco(int veces) {
				
				for(int i = 0; i < veces; i++) {
					System.out.print("eco... ");
				}
			}

	public static void main(String[] args) {
		//Declaración de variables
		String numeroIntroducido;
		
		//Captura número introducido
        numeroIntroducido = captura_de_valor();
        int numero_a_iterar = Integer.parseInt(numeroIntroducido);
        
        //Llamada a la funcion que ha de imprimir la palabra eco
        eco(numero_a_iterar);

	}

}
