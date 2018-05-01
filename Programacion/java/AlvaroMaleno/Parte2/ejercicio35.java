//Programa para realizar copia de un archivo cuya ruta ha sido introducida por línea de comandos

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class ejercicio35 {
	
	//Función que recibe una ruta de origen y otra de destino e imprime el archivo. Lee una línea, la carga en el almacén de memoria y, si ésta no es nula la imprime en un nuevo archivo.
		public static void copia_contenido(String archivo, String copia) throws FileNotFoundException, IOException{
			
			//Declaración de variables y objetos
			String linea;
			PrintWriter pw = new PrintWriter(copia);
			FileReader a = new FileReader(archivo);
			BufferedReader b = new BufferedReader(a);
			
			//Ciclo de impresión
			while((linea = b.readLine()) != null) {
				pw.println(linea);
				
			//Cierre de objetos	en memoria
			}b.close();
			pw.close();
		}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		

		//Declaración de variables
		String rutaIntroducida;
		String nombreArchivoTemporal = "";
		String rutaCopia = "";
		 
		
		rutaIntroducida = args[0];
		
		//Búsqueda de la barra que marca el inicio del nombre del archivo
		for(int i = rutaIntroducida.length() - 1; i > 0; i--) {
			
			if(rutaIntroducida.substring(i - 1, i).equals("\\") == true) {
				//Encuentra la barra y le añade copia_de al nombre del archivo a un nuevo string
				nombreArchivoTemporal = "copia_de_" + rutaIntroducida.substring(i);
				
				//Colocación de la ruta de salida. Lo hace letra por letra hasta encontrar el lugar en el que ha de ir el String anteriormente creado. Lo coloca y rompe el ciclo.
				for(int j = 0; j < rutaIntroducida.length(); j++) {
					
					if(j == i - 1) {
						
						rutaCopia += "\\" + nombreArchivoTemporal;
						
						
						break;
						
					}else {
						
						rutaCopia += rutaIntroducida.substring(j, j + 1);
					}
					
				//Como ya se ha creado la ruta de salida de la copia no es necesario continuar la iteración.	
				}break;
			}
			
			
		}
		
		//Imprime el lugar en el que ha de crear la copia
		System.out.println(rutaCopia);
		
		
		//Llamada a la función que ha de imprimir el archivo
		copia_contenido(rutaIntroducida, rutaCopia);
		

	}

}
