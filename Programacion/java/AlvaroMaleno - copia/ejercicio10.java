//Programa para calcular la fecha del día siguiente al introducido por el usuario

import java.util.Scanner;

public class ejercicio10 {
	
	//Declaración de variables 
			static String numero = "[0-9]{4}\\/[0-9]{2}\\/[0-9]{2}";
			static Scanner entradaNumero = new Scanner(System.in);
			static String fechaIntroducida;
			static int año, mes, día;
			static String año_string, mes_string, dia_string;
			static int [] dias_por_mes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			
			//Rutina para comunicar un error
			public static void error(String mensaje) {
				String mensajeTemporal;
				mensajeTemporal = mensaje;
		        System.err.println(mensajeTemporal);
		        delete();
		        programa();
		        
			}
			
			public static void programa() {
				
				//Petición de fecha al usuario
				
				fechaIntroducida = peticion_fecha();
				
				//Comprobación de errores y captura de variables
				comprobacion_de_errores();
				
				//Cálculo de la fecha del día siguiente
				dia_siguiente();
				
				//Escritura en el formato de salida adecuado
				conversion_a_string();
				
				//Salida del programa
				System.out.println("La fecha del día siguiente es: " + año_string + "/" + mes_string + "/" + dia_string + ".");
				System.exit(0);
				
				
			}
			
			//Rutina de captura fecha introducida por el usuario
			public static String peticion_fecha() {
				
				System.out.println("Por favor, introduzca una fecha válida (aaaa/mm/dd): ");
				return entradaNumero.nextLine();
			}
			
			//Rutina de comprobación de errores y transformación de variables
			public static void comprobacion_de_errores() {
				
				if (!fechaIntroducida.matches(numero)) error("La fecha introducida no posee el formato adecuado.");
				
				año = Integer.parseInt(años(fechaIntroducida));
				
				mes = Integer.parseInt(meses(fechaIntroducida));
				
				if (mes > 12) error("El mes introducido es incorrecto.");
				día = Integer.parseInt(dias(fechaIntroducida));
				
				if (día > dias_por_mes[mes - 1]) error("El día introducido es incorrecto.");
				
			}
			
			//Método de cálculo del día siguiente
			public static void dia_siguiente(){
				día += 1;
				
				if (día > dias_por_mes[mes - 1]) {
					día = 1;
					mes += 1;
					if (mes > 12) {
						mes = 1;
						año += 1;
					}
				}
				
			}
			
			//Método de conversion al formato adecuado
			public static void conversion_a_string(){
				
				año_string = Integer.toString(año);
				while(año_string.length() < 3) {
					año_string = "0" + año_string;
					
				}
				
				mes_string = Integer.toString(mes);
				while(mes_string.length() < 2) {
					mes_string = "0" + mes_string;
				}
				
				
				dia_string = Integer.toString(día);
				while(dia_string.length() < 2) {
					dia_string = "0" + dia_string;
				}
				
			}
			
			//Método para aislar la variable años
			public static String años(String fecha) {
				
				String año_a_calcular = "";
				
				año_a_calcular = fecha.substring(0 , 4);
					
				return año_a_calcular;
			}
			
			//Método para aislar la variable meses
			public static String meses(String fecha) {
				
				String mes_a_calcular = "";
								
				mes_a_calcular = fecha.substring(5, 7);
				
				return mes_a_calcular;
			}
			
			//Método para aislar la variable días
			public static String dias(String fecha) {
				
				String dia_a_calcular = "";
				
				dia_a_calcular = fecha.substring(8, fecha.length());
				
				return dia_a_calcular;
					
			}
			
			//Método para reiniciar las variables
			public static void delete() {
				fechaIntroducida = "";
				año = 0; 
			    mes = 0;
			    día = 0;
				año_string = "";
				mes_string = "";
				dia_string = "";
			}
			
	public static void main(String[] args) {
		//Llamada al programa principal
		programa();
		

	}

}
