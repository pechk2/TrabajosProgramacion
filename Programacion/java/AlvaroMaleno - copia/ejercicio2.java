//Demostración del tipo de dato short como elemento cíclico.
import java.util.Scanner;

public class ejercicio2 {
	//Comprobación de error mediante expresión regular.
	static String comprobacionNumero = "((32768))|(-(32769))";

	public static void main(String[] args) {
		
		//Bibliografía:
		//https://en.wikipedia.org/wiki/Two%27s_complement

		//Declaración de variables y objeto escáner
		short numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);
        String numeroIntroducido;

        //Petición de valor al usuario
        do{ 
        	System.out.println("El tipo short comprende los valores entre : -32.768 y 32.767");
            System.out.println("Introduce uno de los números siguientes(-32.769 o 32.768) sin puntos ni espacios:  ");
            numeroIntroducido =  sc.nextLine();
        }while(!numeroIntroducido.matches(comprobacionNumero));

        numero = (short) Integer.parseInt(numeroIntroducido);

        exp = 0;

        binario = 0;

        //Conversor de valor a binario
        while(numero != 0){
                digito = (short) (numero % 2);            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = (short) (numero/2);
        }

        //Explicación de la ciclicidad del tipo short en forma de salida del programa
        System.out.println("  32.767 en binario es igual a  0111111111111111.");
        System.out.println("- 32.768 en binario es igual a -1000000000000000 o lo que es lo mismo: 0111111111111111.");
        System.out.println("");
        System.out.printf("Binario introducido por usted: %.0f %n", binario);

        if (Integer.parseInt(numeroIntroducido) == 32768) {
        	System.out.println("");
        	System.out.println("Es decir: 1111111111111111");
        	System.out.println("         -1000000000000000");
        	System.out.println("         -------------------");
        	System.out.println("          0111111111111111  Lo que, sin el primer cero que nos indica el signo del número decimal sería igual a la representación binaria del número: -32.768");
        	
        	
        }else {
        	System.out.println("");
        	System.out.println("Es decir: 01111111111111111, exactamente la misma representación binaria que posee el número 32.767");
        }System.out.println("");
        System.out.println("Lea la bibliografía y realice los cálculos por sí mismo para convencerse: ");
        System.out.println("Bibliografía: https://en.wikipedia.org/wiki/Two%27s_complement");
    }

	}


