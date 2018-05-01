

public class ejercicio27 {

	public static void main(String[] args) {
		
		//Declaración de variables a emplear
		String palabraClavemin = "siurell";
		String palabraClavemay = "SIURELL";
		String palabraClave = "Siurell";
		int i = 0;
		String resultado = "";
		
		//Ciclo iterativo para extraer las palabras deseadas
		while((args[i].equals(palabraClave) == false) & (args[i].equals(palabraClavemay) == false) & (args[i].equals(palabraClavemin) == false)) {
			
			resultado += args[i] + " ";
			i += 1;
			if (i == args.length) break;
		}
		//Salida del programa
		System.out.println(resultado.substring(0, resultado.length() - 1));

	}

}
