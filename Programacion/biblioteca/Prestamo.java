//Importarndo herramientas
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Prestamo {
	String[][] prestamos = new String [50][3];
	int prestamoActual = 0;

	//Almacena en una lista el título, el usuario y la fecha en la que se efectúa el préstamo
	public void efectuarPrestamo(String usuario, String titulo) throws ParseException {

	for(int i = 0; i < prestamos.length; i++) {
		if((prestamos[i][0] == null || prestamos[i][0].equals("")) && prestamoActual < 49) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar c1 = Calendar.getInstance();
			String fecha = sdf.format(c1.getTime());
			prestamos[prestamoActual][0] = usuario;
			prestamos[prestamoActual][1] = titulo;
			prestamos[prestamoActual][2] = fecha;
			prestamoActual += 1;
			break;

		}else {

			System.out.println("Alcanzado limite de prestamos.");
		}



	}


	}

	//Elimina de la lista el préstamo en cuestión
	public void efectuarDevolucion(String usuario, String titulo) {

		for(int i = 0; i < prestamos.length; i++) {

			if((prestamos[i][0] != null && !prestamos[i][0].equals("")) && prestamos[i][0].equals(usuario) && prestamos[i][1].equals(titulo)) {
				prestamos[i][0] = "";
				prestamos[i][1] = "";
				prestamos[i][2] = "";
				prestamoActual -= 1;

			}

		}


		}

	//Recorre la lista de préstamos y los imprime por pantalla
	public void listarPrestamos() throws ParseException {
		int contador = 0;
		for(int i = 0; i < prestamos.length; i++) {

			if(prestamos[i][0] != null && !prestamos[i][0].equals("")) {

				contador += 1;


				System.out.println("El usuario " + prestamos[i][0] + ", posee el libro " + prestamos[i][1] + " desde el dia: " + prestamos[i][2]);
			}

		}
		if(contador == 0){
			System.out.println("No hay libros en prestamo.");
		}
	}

	//Comprueba y lista a todos los usuarios morosos
	public void listarMorosos() throws ParseException {

		String [][] morosos = new String[50][3];
		int j = 0;

		for(int i = 0; i < prestamos.length; i++) {

			if(prestamos[i] != null) {

				String fecha1 = prestamos[i][2];
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime(sdf.parse(fecha1));
				Calendar hoy = Calendar.getInstance();
				long milisec = hoy.getTimeInMillis()- cal.getTimeInMillis();
				milisec = milisec / 1000 / 60 / 60 / 24;
				if(milisec > 15) {
					morosos[j][0] = prestamos[i][0];
					morosos[j][1] = prestamos[i][1];
					morosos[j][2] = Long.toString(milisec);
				}
			}
		}

		for(int i = 0; i < morosos.length; i++) {
			System.out.println("El usuario " + morosos[i][0] + " tiene un retraso de " + morosos[j][2] + " por el libro " + morosos[j][1] + "." );
		}
	}






}
