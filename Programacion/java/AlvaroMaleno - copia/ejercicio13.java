//Programa para calcular el producto de los diez primeros números impares de la recta

public class ejercicio13 {

	public static void main(String[] args) {
		
		//Declaración de variables a emplear
		int [] diezImpares = new int[10];
		int iterador = 0;
		int i = 1;
		int productoImpares = 1;
		
		
		//Captura de los diez primeros dígitos impares
		while (iterador < diezImpares.length) {
			
			if (i % 2 != 0) {
				diezImpares[iterador] = i;
				
				iterador += 1;
			}
			i += 1;
			
			
		}
		
		//Reinicio de variable iterativa
		i = 0;
		
		//Cálculo del producto de los diez primeros guarismos impares
		while(i < diezImpares.length) {
			
			productoImpares *= diezImpares[i];
			
			i += 1;
			
		}
		
		//Impresión del resultado por pantalla
		System.out.println("El producto de las diez primeras cifras impares es: " + productoImpares );
		

	}

}
