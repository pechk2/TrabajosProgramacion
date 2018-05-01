//Programa para imprimir tantos primos como quepan en 2 ** 20 bytes. Tarda mas de una hora en hallarlos todos

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ejercicio36 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//1.000.000 bytes / 4 bytes por int + 4 bytes por indice
		final int [] numeros = new int [125000];
		
		//Declaracion de variables a emplear
		int divisores;
		int iterador = 1;
		numeros[0] = 1;
		int i = 2;
		PrintWriter pw = new PrintWriter("primos.txt");
		int columnas = 0;
		
		
			//Ciclo de busqueda de numeros primos
			while(iterador < numeros.length) {
				divisores = 0;
				
				
				
				for(int j = 1; j <= i; j ++) {
					
					if(i % j == 0) {
						divisores += 1;
					}
					
					
					
				}if(divisores < 3) {
					numeros[iterador] =  i;
					iterador += 1;
					
				}i += 1; 
				
			}
			
		
		//Escritura de numeros en archivo de texto con formato
		for(int k = 0; k < numeros.length; k++) {
			
			if(columnas < 10) {
				
				pw.printf("%07d" + " ", numeros[k]);

				columnas += 1;
				
			}else {
				
				pw.println("");
				pw.printf("%07d" + " ", numeros[k]);

				columnas = 1;
			}
			
			
		}pw.close();

	}

}
