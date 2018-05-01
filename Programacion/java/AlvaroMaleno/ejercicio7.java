//Programa para la resolucion de una ecuacion de segundo grado
import java.util.Scanner;

public class ejercicio7 {
	//Comprobación de errores mediante expresión regular(sólo números con un máximo de 12 decimales)
	static String comprobacionNumero = "(\\-?[1-9]\\d*\\.\\d{1,12})|(\\-?0{1}\\.0{1,5}\\d{1,7})|(\\-?0{1}\\.\\d{1,12})|(\\-?[0-9]\\d*)";
	static String comprobacionResultado = "(\\-?[1-9]\\d*\\.\\d*)|(\\-?0\\.0\\d*)|(\\-?0\\.\\d*)|(\\-?[0-9]\\d*)";
	
	//Creación del objeto escáner
	static Scanner sc = new Scanner(System.in);
	
	////Declaración de variables de espectro global
	static double a, b, c, resultado1, resultado2;
	
	static void programa() {
		
		//Declaración de variables
		String numeroIntroducido1, numeroIntroducido2, numeroIntroducido3;
		
        //Captura del primero número introducido
        numeroIntroducido1 = captura_de_valor(0);
        if (Double.parseDouble(numeroIntroducido1) == 0){
        	System.out.println("Error, division por cero.");
        	delete();
        	programa();
        }
        
        //Captura del segundo número introducido
        numeroIntroducido2 = captura_de_valor(1);
        
      //Captura del tercer número introducido
       numeroIntroducido3 = captura_de_valor(1);
        
      //Conversión la cadena capturada en número decimal
        a = Double.parseDouble(numeroIntroducido1);
        b = Double.parseDouble(numeroIntroducido2);
        c = Double.parseDouble(numeroIntroducido3);
        
        //Evaluación de la expresión
        resultado1 = solucion1(a , b, c);
        resultado2 = solucion2(a, b, c);
        
        //Salida del programa
        if ((!Double.toString(resultado1).matches(comprobacionResultado)) || (!Double.toString(resultado2).matches(comprobacionResultado))) {
        	
        	
        	System.out.println("La solución es imaginaria.");
        	
        	
        }else {
        	
        	System.out.println("La solución mediante el empleo del signo positivo es: " + solucion1(a , b , c));
            System.out.println("\nLa solución mediante el empleo del signo negativo es: " + solucion2(a, b, c));
        	
        }
        
        
        
		
	}
	
	//Evaluacion expresion con signo positivo
	static double solucion1(double x, double y, double z) {
		double i = y - 2*y;
		double j = y * y - 4 * x * z;
		j = Math.sqrt(j);
		double d = i + j;
		d = (d) / 2 * x; 
		
		//return (-y + ((Math.sqrt(y * y - 4 * x * z) / 2 * x)));
		return d;
		
	}
	
	//Evaluacion expresion con signo negativo
	static double solucion2(double x, double y, double z) {
		double i = y - 2*y;
		double j = y * y - 4 * x * z;
		j = Math.sqrt(j);
		double d = i - j;
		d = (d) / 2 * x; 
		
		
		//return (-y - ((Math.sqrt(y * y - 4 * x * z) / 2 * x)));
		return d;
	}
	
	//Peticion de valores
	static String captura_de_valor(int a) {
		String numeroIntroducido;
		
		if (a == 0){
		
			do{ 
        	
				System.out.println("Introduzca un número real(sin ceros a la izquierda), decimales(max. 12) empleando un punto por coma:   ");
				numeroIntroducido =  sc.nextLine();
  
            
				}while(!numeroIntroducido.matches(comprobacionNumero));
		
			return numeroIntroducido;
		
	 }else {
		 
		 do{ 
	        	
	            System.out.println("Introduzca otro número real(sin ceros a la izquierda), decimales(max. 12) empleando un punto por coma:   ");
	            numeroIntroducido =  sc.nextLine();
	            
	        }while(!numeroIntroducido.matches(comprobacionNumero));
		 
		 return numeroIntroducido;
	 }
		
	}
	
	//Reinicio de variables
	static void delete() {
		a = 0;
		b = 0;
		c = 0;
		resultado1 = 0;
		resultado2 = 0;
	}
	
	public static void main(String[] args) {
		
		//Llamada al programa
		programa();
		
		
		        
		        

	}

}
