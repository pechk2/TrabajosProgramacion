
//Juego del ahorcado

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio33 {

	public static void main(String[] args) {
		
		//Creación del objeto escáner
		Scanner sc = new Scanner(System.in);
				
		//Declaración de variables
		String palabraIntroducida, letra;
		String palabraOculta = "";
		int oportunidades = 7;
		boolean barras = false;
		int aciertos = 0;
		ArrayList <String> letras_propuestas = new ArrayList<String>();
		
		
		//Comienzo del juego
		System.out.println("JugadorA, introduzca una palabra secretamente.");
		  
		palabraIntroducida =  sc.nextLine();
		
		//Elaboración de palabra a mostrar por pantalla
		for(int i = 0; i < palabraIntroducida.length(); i++) {
			
			palabraOculta += "_ "; 
		}
		
				        
		System.out.println("La palabra a acertar es: " + palabraOculta);	
		
		//Ciclo de juego
		do{ 
				        	
			//Petición de letra al jugadorb
			System.out.println("JugadorB, introduzca una letra.");
				  
			letra =  sc.nextLine();
			
			letras_propuestas.add(letra);
			
			//Comprobación de acierto o error
			if(palabraIntroducida.indexOf(letra) > -1) {
				
				palabraOculta = "";
				
				System.out.println("\n" + "Muy bien");
				
				aciertos += 1;
				
				//Reescritura de la palabra oculta a mostrar por pantalla
				for (int i = 0; i < palabraIntroducida.length(); i++) {
					barras = true;
					for(int j = 0; j < letras_propuestas.size(); j++) {
						
						if(i == palabraIntroducida.indexOf(letras_propuestas.get(j))) {
							palabraOculta += letras_propuestas.get(j) + " ";
							barras = false;
							
						}
							
							
						}
						if(barras) {
							palabraOculta += "_ ";
						}
						
					
				}
				
			}else {
				oportunidades -= 1;
			}
			//Muestra las letras ya escritas
			System.out.println("\n" + "Has escrito las siguientes letras: \n");
			
			for(int i = 0; i < letras_propuestas.size(); i++) {
				
				System.out.print(letras_propuestas.get(i) + " ");
			}
			//Muestra la puntuación
			System.out.println("\n" + "Intentos restantes: " + oportunidades);
			System.out.println("\n" + palabraOculta);
				            
		//El ciclo permanece mientras haya letras ocultas o queden oportunidades		 
		}while((palabraOculta.indexOf("_") > 0) & (oportunidades > 0));
		
		//Fin de juego
		System.out.println("\nGracias por jugar");
				
		
		
		

	}

}
