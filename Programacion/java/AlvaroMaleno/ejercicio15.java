//Programa que muestra por pantalla todos los números primos menores al introducido por el usuario

//Importación de módulos
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio15 {
	
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
		
		

	public static void main(String[] args) {
		
				//Declaración de variables
				String numeroIntroducido;
				int iterador = 1;
				int iteradorj = 0;
				
				//Creación de objeto dinámico ArrayList de tamaño indefinido
				ArrayList<Integer> primosList = new ArrayList<Integer>();
				
				//Captura número introducido
		        numeroIntroducido = captura_de_valor();
		        int numero_a_iterar = Integer.parseInt(numeroIntroducido);
		        
		        //Comprobación de si cada número menor al introducido es primo o no
		        while(iterador <= numero_a_iterar) {
		        	
		        	for(int i = 1; i <= iterador; i++) {
		        		
		        		if (iterador % i == 0) {
		        			
		        			iteradorj += 1;
		        				
		        			}
		        		}
		        		 if (iteradorj <= 2) {
	    				
		        			 primosList.add(iterador);
		        			 
		        			 }
		        		 
   				
		            iteradorj = 0;
   			
		        	iterador += 1;
		        	
		        	}
		        	 
		        	
		        
		        //Escritura en pantalla de los números primos hallados
		        int i = 0;
		        System.out.println("Los números primos menores al número donado son: ");
		        while(i < primosList.size()) {
		        	if (i + 1 == primosList.size()) {
		        		System.out.print("y " + primosList.get(i) + ".");
		        	}else {
		        		System.out.print(primosList.get(i) + ", ");
		        	}
		        	
		        	i += 1;
		        	
		        }
		        
	}

}
