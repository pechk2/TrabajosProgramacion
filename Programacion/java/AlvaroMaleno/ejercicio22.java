//Programa para exponer un vector de números aleatoreos ordenados de menor a mayor.

import java.util.Scanner;

public class ejercicio22 {
	//Expresión regular para comprobar el error
			static String comprobacionNumero = "([1-9]\\d*)";
			
			//Declaración de variables. Se emplean variables goblales para evitar la acumulación de las mismas en caso de necesitarse el reinicio del programa.No intenten lo mismo en casa.
			static String numeroIntroducido;
			static int numero_a_iterar;
			
			//Creación del objeto escáner
			static Scanner sc = new Scanner(System.in);
			
			//Petición de valor
			static String captura_de_valor() {
							
				String numeroIntroducido;
							
					do{ 
					        	
						System.out.println("Introduzca un número entero(sin ceros a la izquierda ni decimales):  ");
									
								numeroIntroducido =  sc.nextLine();
					  
					            
							}while(!numeroIntroducido.matches(comprobacionNumero));
							
							return numeroIntroducido;
						}
			
			//Función para ordenar una lista de menor a mayor
			static int []  ordenar(int [] a ) {
				
				int max = 0;
				
				for(int i = 0; i < (a.length - 1); i++){
					
		            for(int j = i + 1 ;j < a.length;j++){
		            	
		                if(a[i] > a [j]){
		                    
		                    max = a[i];
		                    a[i] = a[j];
		                    a[j] = max;
				}
		                }
		            
				}return a;
}
			
			
			//Cuerpo del programa
			static void programa() {
				
				//Captura números introducidos
		        numeroIntroducido = captura_de_valor();
		        numero_a_iterar = Integer.parseInt(numeroIntroducido);
		        
		        int [] aleatoreos = new int [numero_a_iterar];
		        
		        
		        //Rellenar el vector
		        for(int i = 0; i < numero_a_iterar; i++) {
		        	
		        	aleatoreos[i] = (int) Math.floor((Math.random() * (Math.random() * 1000)) + 0.5);
		        	
		        	
		        }
		        
		        //Ordenar el vector
		        aleatoreos = ordenar(aleatoreos);
		        
		        //Salida del programa
		        System.out.println("Los números con los que se ha rellenado el vector son: \n");
		        
		        for(int i = 0; i < aleatoreos.length; i++) {
		        	if (i + 1 == aleatoreos.length) {
		        		System.out.print(" y " + aleatoreos[i] + ".");
		        	}else {
		        		System.out.print(aleatoreos[i] + ", ");
		        	}
		        }
		       
		        
			}

		public static void main(String[] args) {
			
			//Llamada al programa
			programa();
			

		}

	}
