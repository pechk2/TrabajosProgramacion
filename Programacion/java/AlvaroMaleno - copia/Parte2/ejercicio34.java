//Programa para imprimir pon pantalla un archivo de texto


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ejercicio34 {
	
	//Función que recibe una ruta e imprime el archivo. Lee una línea, la carga en el almacén de memoria y, si ésta no es nula la imprime.
	public static void imprime_contenido(String archivo) throws FileNotFoundException, IOException{
		String linea;
		FileReader a = new FileReader(archivo);
		BufferedReader b = new BufferedReader(a);
		while((linea = b.readLine()) != null) {
			System.out.println(linea);
			
		}b.close();
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//Declaración de variables
		String rutaIntroducida;
		
		rutaIntroducida = args[0];
		
		//Llamada a la función que ha de imprimir el archivo
		imprime_contenido(rutaIntroducida);
	}

}
