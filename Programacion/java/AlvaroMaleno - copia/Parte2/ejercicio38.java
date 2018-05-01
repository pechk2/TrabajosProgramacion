//Programa para crear archivo tga con colores en binario

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ejercicio38 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Declaración de variables
		short  numero, exp, digito;
		double binario;
		final double [][] datos = new double [1200][800];
		int espaciosHorizontales = 1;
		int espaciosVerticales = 0;

		//El relleno consiste en sumar uno a cada elemento columna de la fila
		int relleno = 0;
		
		PrintWriter pw = new PrintWriter("imagen.tga");
		pw.println("");
		pw.println("P3");
      	pw.println("");
      	pw.println("1200 800");
      	pw.println("");
      	pw.println("256 256");
      	
		
		//El relleno se convierte a binario y se imprime. La escala de colores debe ir desde negro hasta el blanco pasando por azules y lilas.
		for(int i = 0; i < 1200; i++) {
			
			if(espaciosVerticales == 4){

				pw.println("");
				pw.println("");
				espaciosVerticales = 1;

			}else{

				pw.println("");
				espaciosVerticales += 1;
			}
			
			
			for(int j = 0; j < 800; j++) {
				
				exp=0;
			    binario=0;
			    numero = (short) relleno;
			    
			    while(numero!= 0){
			    	
			    	digito = (short) (numero % 2);  
			    	
			        binario = binario + digito * Math.pow(10, exp); 
			        
			        exp++;
			        
			        numero = (short) (numero / 2);
			        }

				datos[i][j] = binario;
				
				relleno += 1;

				if(relleno == 255){

					relleno = 0;
				}
				
				if(espaciosHorizontales == 3){

					pw.printf("%08.0f" + "  ", datos[i][j]);
					espaciosHorizontales = 1;

				}else{

				
				pw.printf("%08.0f" + " ", datos[i][j]);
				espaciosHorizontales += 1;

				}
				
				
			}
		}
		pw.close();
		
	}

}
