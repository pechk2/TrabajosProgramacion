public class Regular {
	
	/*Comprueba si el texto introducido es un email*/
	static String email = "[a-zA-z]+(\\.[A-Za-z]+)?@[A-Za-z]+\\.[A-Za-z]{1,3}";
	static String nom = "[A-Z][a-z]+( ([A-Z]\\.|[A-Z][a-z]+))?( [A-Z][a-z]+){2}";
	static String numero = "[1-9]\\d+";
	static String correcte = "((0[0-9]|[12][0-9]|3[0-1]) de (ene|mar|mayo|jul|ago|oct|dic)|(0[0-9]|[12][0-9]|30) de (abr|jun|sep|nov)|([1-9]|1[0-9]|2[0-8]) de (feb)) de [1-9]\\d{3}";
	public  static void main (String[] args) {


		if (args.length != 1) {
			System.exit(0);
		}

		if (args[0].matches(correcte)) {
			System.out.println("Correcte");
		}else {
			System.out.print("Incorrecte");
		}
	}
}