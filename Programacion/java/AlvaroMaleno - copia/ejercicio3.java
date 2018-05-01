//El programa realiza la media entre dos números introducidos por el usuario

import java.util.Scanner;

public class ejercicio3 {
	//Comprobación de errores mediante expresión regular(sólo números con un máximo de 12 decimales
	static String comprobacionNumero = "(\\-?[1-9]\\d*\\.\\d{1,12})|(\\-?0{1}\\.0{1,5}\\d{1,7})|(\\-?0{1}\\.\\d{1,12})|(\\-?[1-9]\\d*)";
	

		
	
	
	public static void main(String[] args) {

		//Declaración de variables
		double numero1, numero2;
		String numeroIntroducido1, numeroIntroducido2;

		//Creación del objeto escáner
		Scanner sc = new Scanner(System.in);
        
        
        //Captura el primero número introducido
        do{ 
        	
            System.out.println("Introduzca un número real(sin ceros a la izquierda), decimal(max. 12) empleando un punto por coma:  ");
            numeroIntroducido1 =  sc.nextLine();
  
            
        }while(!numeroIntroducido1.matches(comprobacionNumero));
        
        //Captura el segundo número introducido
        do{ 
        	
            System.out.println("Introduzca otro número real(sin ceros a la izquierda), decimal(max. 12) empleando un punto por coma:  ");
            numeroIntroducido2 =  sc.nextLine();
            
        }while(!numeroIntroducido2.matches(comprobacionNumero));
        
        //Convierte la cadena capturada en número decimal
        numero1 = Double.parseDouble(numeroIntroducido1);
        numero2 = Double.parseDouble(numeroIntroducido2);
        
       //Devuelve el resultado 
       System.out.println( "La media de ambos números es: " + Double.toString(Math.floor(((numero1 + numero2) / 2) + 0.5)));
        
	}

}
