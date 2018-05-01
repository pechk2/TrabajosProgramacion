//Programa para escribir en binario una matriz con su correspondiente índice

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ejercicio37 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Declaración de variables
		short  numero, exp, digito;
		double binario;
		final double [][] datos = new double [10][10];
		
		//El relleno consiste en sumar uno a cada elemento columna de la fila
		int relleno = 0;
		
		PrintWriter pw = new PrintWriter("dades.bin");
		
		//El relleno se convierte a binario y se imprime
		for(int i = 0; i < 10; i++) {
			
			pw.println("");
			
			for(int j = 0; j < 10; j++) {
				
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
				
				//Escritura en archivo con formato
				pw.printf("%08.0f" + " ", datos[i][j]);
				
			}
		}
		pw.close();
		
	}

}
