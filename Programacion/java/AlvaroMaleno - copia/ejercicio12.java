//Programa que muestra por pantalla los múltiplos de siete menores a cien

public class ejercicio12 {
	
	 //Múltiplo máximo de siete menor a cien
	static int maxMultiplo = 98;

	public static void main(String[] args) {
		//Declaración de variables a emplear
		int multiplos = 0;
		int iterador = 0;
		
		//Salida que muestra el programa por panatalla
		System.out.println("Los múltiplos de siete menores de cien son: ");
		while(multiplos < maxMultiplo) {
			multiplos = iterador * 7;
			System.out.println("7 x " + iterador + " = " + multiplos);
			iterador += 1;
		}

	}

}
