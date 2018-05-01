//Programa que muestra la cantidad de elementos de una sucesión de Fibonacci
//Autor: Álvaro Maleno Alférez

import java.util.Scanner;

public class ejercicio19 {
	
	//Expresión regular para comprobar el error
	static String comprobacionNumero = "([1-9]\\d*|[0]{1})";
			
	//Declaración de variables. Se emplean variables goblales para evitar la acumulación de las mismas en caso de necesitarse el reinicio del programa.No intenten lo mismo en casa.
	static String numeroIntroducido;
	static int numero_a_iterar;
	
	
	//Creación del objeto escáner
	static Scanner sc = new Scanner(System.in);
			
			
	//Petición de valores
	static String captura_de_valor() {
					
		String numeroIntroducido;
					
			do{ 
			        	
				System.out.println("Introduzca un número entero(sin ceros a la izquierda ni decimales):  ");
							
						numeroIntroducido =  sc.nextLine();
			  
			            
					}while(!numeroIntroducido.matches(comprobacionNumero));
					
					return numeroIntroducido;
				}
			
			//Contador de guarismos
			static int contador_terminos(int a) {
				
				int contador = 0;
				int sumador = 0;
				while (a - 2 >= 0) {
					sumador = (a - 1) + (a - 2);
					a -= 1;
					contador += 1;
					
				}
				return contador;
			}
			
			//Cálculo de la sucesión de fibonacci mediante Gauss
			static int suma_gauss(int a) {
				int suma;
				
				suma = (a - 1) * (a);
				
				return suma / 2;
			}
			
			//Cálculo de la sucesión de fibonacci mediante recursividad
			static int fibonacci_recursivo(int a) {
				
				if(a == 0) {
					return 0;
				}else {
					
					return a - 1 + fibonacci_recursivo(a - 1);
				}
			}
			
			//Cuerpo del programa
			static void programa() {
				
				//Captura números introducidos
		        numeroIntroducido = captura_de_valor();
		        numero_a_iterar = Integer.parseInt(numeroIntroducido);
		        
		        System.out.println("\nBien, la cantidad de elementos de la sucesión es: " + contador_terminos(numero_a_iterar));
		        
		        System.out.println("\nNada mal. La suma de los elementos de la sucesión es: " + suma_gauss(numero_a_iterar));
		        
		        
		        //System.out.println("\nLo hago genial. Bien, ahora la suma de los elementos de la sucesión es mediante recursividad: " + fibonacci_recursivo(numero_a_iterar));
		        
		        System.out.println("\n Enhorabuena, es usted un genio.");
			}
			
	 public static void main(String[] args) {
				
				//Bienvenida e inicio del programa
				System.out.println("A continuación se le demandará que introduzca un número entero.\n Así, como soy un programa sofisticado, espera usted"
						+ " que le diga exactamente cuántas cifras tendrá una sucesión de fibonacci en función de un valor arbitrario introducido por sí mismo. Ejemm...\n"
						+ "bien. Piense en ese vaolor, pues, puesto que una sucesión de fibonacci tiene la siguiente forma: (n - 1) + (n - 2)..., puedo decirle que \n"
						+ "tendrá tantos dígitos como sumas haya, esto es, una por término, es decir, el número que haya pensado menos uno. Pero, para que no sienta\n"
						+ "que se ha gastado el dinero en mí para nada, a continuación le pediré que introduzca un número entero y le calcularé cuántos valores posee\n"
						+ "la serie y el resultado final de ésta mediante la suma de números de mi amigo el pato Donald...digo.. esto... Gauss, y mediante mi super\n"
						+ " método megarrecursivo personalizado.\n");
				
				programa();

			}


}
