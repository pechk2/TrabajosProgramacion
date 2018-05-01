//Programa para saber cuál es el número mayor de entre dos dígitos introducidos por el usuario

import java.util.Scanner;

public class ejercicio6 {
	//Comprobación de errores mediante expresión regular(sólo números con un máximo de 12 decimales
		static String comprobacionNumero = "(\\-?[1-9]\\d*\\.\\d{1,12})|(\\-?0{1}\\.0{1,5}\\d{1,7})|(\\-?0{1}\\.\\d{1,12})|(\\-?[1-9]\\d*)";

	public static void main(String[] args) {
		
		//Declaración de variables
		double numero1, numero2;
		String numeroIntroducido1, numeroIntroducido2;
		
		//Creación del objeto escáner
		Scanner sc = new Scanner(System.in);
        
        
        //Captura del primero número introducido
        do{ 
        	
            System.out.println("Introduzca un número entero(sin ceros a la izquierda) o decimal(max. 12) empleando un punto por coma:  ");
            numeroIntroducido1 =  sc.nextLine();
  
            
        }while(!numeroIntroducido1.matches(comprobacionNumero));
        
        //Captura del segundo número introducido
        do{ 
        	
            System.out.println("Introduzca otro número entero(sin ceros a la izquierda) o decimal(max. 12) empleando un punto por coma:  ");
            numeroIntroducido2 =  sc.nextLine();
            
        }while(!numeroIntroducido2.matches(comprobacionNumero));
        
        //Conversión la cadena capturada en número decimal
        numero1 = Double.parseDouble(numeroIntroducido1);
        numero2 = Double.parseDouble(numeroIntroducido2);
		
        //Comprueba qué número es el mayor e imprime el resultado en pantalla
        if (numero1 > numero2) {
        	
        	System.out.println(numero1 + " es mayor que " + numero2);
        	
        }else if (numero1 == numero2) {
        	
        	System.out.println(numero1 + " es igual que " + numero2);
        	
        }else {
        	
        	System.out.println(numero2 + " es mayor que " + numero1);
        }
        	
        }

	}


