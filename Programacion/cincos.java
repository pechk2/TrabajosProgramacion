public class cincos {
	
	public static int Potencias(int numero) {
		int base = 10;
		int potencias = 0;
		int numTemporal = numero;
		while(numTemporal > 0) {
			numTemporal = numTemporal / base;
			potencias += 1;
			
		}
		return potencias;
	}
	
	public static int [] BuscaCincos(int numero) {
		int [] lista = new int [5];
		int potencias = Potencias(numero);
		int posicionLista = 0;

		if (numero >= 5){

			for(int i = numero; i > 5; i--) {
			for(int j = potencias; j > 0; j--) {
				if(i % Math.pow(10, j) == 5) {
					lista[posicionLista] = i;
					posicionLista += 1;
				}
			}
		}//Fin del doble ciclo
		

		}//Fin del condicional
		
		
		
		return lista;
	}

	public static void main(String[] args) {
		int numero = 30;
		int [] lista = BuscaCincos(numero);
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}
