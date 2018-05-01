//Programa para calcular el perímetro y el área de un círculo utilizando como radio el valor numérico introducido por el usuario
import java.util.Scanner;

public class ejercicio4 {
	//Comprobación de errores mediante expresión regular(sólo números con un máximo de 12 decimales
	static String comprobacionNumero = "([1-9]\\d*\\.\\d{1,12})|(0{1}\\.0{1,5}\\d{1,7})|(0{1}\\.\\d{1,12})|([1-9]\\d*)";

	public static void main(String[] args) {
		
		//Creación del objeto escáner
		Scanner sc = new Scanner(System.in);

		//Declaración de variables
        String numeroIntroducido;
        double area, perimetro, radio;
        
        //Captura el radio introducido tras pedirlo.
        do{ 
        	
            System.out.println("Introduzca el radio de un círculo empleando un número entero(sin ceros a la izquierda) o decimal(max. 12) substituyendo el punto por coma:  ");
            numeroIntroducido =  sc.nextLine();
  
            
        }while(!numeroIntroducido.matches(comprobacionNumero));
		
        //Transforma la cadena capturada en número decimal
        radio = Double.parseDouble(numeroIntroducido);
        
        //Calculo del área y del perímetro
        area = Math.sqrt(Math.pow(Math.PI, 2)  + Math.pow(radio, 2));
        perimetro = 2 * (Math.PI * radio);
        
        //Muestra el resultado por pantalla
        System.out.println("\nEl área del círculo con el radio introducido es: "+ area + " .\n");
        System.out.println("Por otro lado, el perímetro del círculo con el radio introducido es: " + perimetro + " .");

	}

}
