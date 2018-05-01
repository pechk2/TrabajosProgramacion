//Programa para mostrar por pantalla el triángulo de Pascal

import java.util.Scanner;

public class ejercicio25 {
	
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
	

	public static void main(String[] args) {
		
		//Captura números introducidos
        numeroIntroducido = captura_de_valor();
        numero_a_iterar = Integer.parseInt(numeroIntroducido);
		
		
        int[] a = new int[1];
        
        //Creación y muestra por pantalla de la matriz con el triángulo de Pascal
        for (int i = 1; i <= numero_a_iterar; i++) {
        	
            int[] x = new int[i];
            
            for (int j = 0; j < i; j++) {
            	
                if (j == 0 || j == (i - 1)) {
                	
                    x[j] = 1;
                    
                } else {
                	
                    x[j] = a[j] + a[j - 1];
                }
                System.out.print(x[j] + " ");
            }
            a = x;
            System.out.println();
        }
		
	}
}
