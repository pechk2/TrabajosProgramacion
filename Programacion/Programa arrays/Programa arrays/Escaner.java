//Clase de empleo Escáner


import java.util.Scanner;

public class Escaner {

	static Scanner esca = new Scanner(System.in);

	//Lector de cadenas escritas
	public static String leerCadena() {

		String cadena;

		cadena =  esca.nextLine();

		return cadena;

	}



//Lector de números.
public static int leerNumero() {
	int numero;

	numero =  esca.nextInt();

	return numero;
}



}
