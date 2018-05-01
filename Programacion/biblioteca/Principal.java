
//Biblioteca. No hay Acentos debido a la codificacion UTF -8
//Importarndo elementos a usar.
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.TimeZone;



public class Principal {


	public static void main(String[] args) throws ParseException {
		//Declaración de variables
		int seleccion;
		//Empleo de listas dinámicas
		ArrayList<Libro> libros = new ArrayList<Libro>();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		//Instanciación del objeto Préstamo(max.50)
		Prestamo prestamos = new Prestamo();

		//Ciclo que compone el menú de opiones. El programa finaliza al pulsar el 0.
		do {

			System.out.println("Por favor, seleccione una de las siguientes opciones:\n");
			System.out.println("1: Dar de alta nuevo usuario.");
			System.out.println("2: Dar de alta nuevo libro.");
			System.out.println("3: Dar de baja un libro.");
			System.out.println("4: Realizar un prestamo.");
			System.out.println("5: Realizar una devolucion.");
			System.out.println("6: Incrementar ejemplares de un libro.");
			System.out.println("7: Ver prestamos vigentes.");
			System.out.println("8: Ver prestamos cumplidos.");
			System.out.println("0: Salir.");

			seleccion = Escaner.leerNumero();

			//switch como método de iniciación de acciones
			switch (seleccion) {

			//Salida del programa
			case 0: {

				System.out.println("Gracias por su paciencia. Hasta la proxima.");
				System.exit(0);

			}

			//Dar de alta a un usuario. Solamente el nombre ha de ser completado.
			case 1:{

				String  apellidos, direccion, telefono, DNI;
				String nombre;

				System.out.println("Por favor, introduzca un nombre:");
				do {

					nombre = Escaner.leerCadena();

				}while(nombre.equals(""));

				System.out.println("Por favor, introduzca los apellidos(intro para dejar en blanco):");
				apellidos = Escaner.leerCadena();

				System.out.println("Por favor, introduzca la direccion(intro para dejar en blanco):");
				direccion = Escaner.leerCadena();

				System.out.println("Por favor, introduzca un telefono(intro para dejar en blanco):");
				telefono = Escaner.leerCadena();

				System.out.println("Por favor, introduzca el DNI(intro para dejar en blanco):");
				DNI = Escaner.leerCadena();

				usuarios.add(new Usuario(nombre, apellidos, direccion, telefono, DNI));
				break;


			}

			//Dando de alta un libro. El título y el número de ejemplares han de ser completados
			case 2: {

					String escritor, categoria, editorial, edicion, ISBN;
					int cantidad;
					String titulo = "";
					System.out.println("Por favor, introduzca un titulo:");

				do {

					titulo= Escaner.leerCadena();

				}while(titulo.equals(""));

				System.out.println("Por favor, introduzca un escritor(intro para dejar en blanco):");
				escritor = Escaner.leerCadena();

				System.out.println("Por favor, introduzca la categoria del libro(intro para dejar en blanco):");
				categoria = Escaner.leerCadena();

				System.out.println("Por favor, introduzca una editorial(intro para dejar en blanco):");
				editorial = Escaner.leerCadena();

				System.out.println("Por favor, introduzca la edicion(intro para dejar en blanco):");
				edicion = Escaner.leerCadena();

				System.out.println("Por favor, introduzca el ISBN(intro para dejar en blanco):");
				ISBN = Escaner.leerCadena();

				System.out.println("Por favor, introduzca la cantidad de ejemplares:");
				cantidad = Escaner.leerNumero();

				libros.add(new Libro(titulo, escritor, categoria, editorial, edicion, ISBN, cantidad));
				break;


			}

			//Dar de baja un libro
			case 3: {

				String nombre;

				System.out.println("Por favor, introduzca un titulo a continuacion.");

				nombre = Escaner.leerCadena();
				//Compara el título introducido con los títulos disponibles y elimina el adecuado.
				for(int i = 0; i < libros.size(); i++) {
					if (libros.get(i).getTitulo().equals(nombre)) {
						libros.remove(i);
					}


				}break;
			}

			//Otorgando préstamos
			case 4: {

				String nombreUsuario, tituloLibro;
				int cantidad = 0;

				System.out.println("Por favor, introduzca un titulo a continuacion.");
				do{

					tituloLibro = Escaner.leerCadena();
				}while(tituloLibro.equals(""));
				System.out.println("Introduzca la cantidad de ejemplares a prestar:");
				do{

					cantidad = Escaner.leerNumero();
				}while(cantidad <= 0);
				System.out.println("Por favor, introduzca el nombre del usuario a continuacion.");
				do{

					nombreUsuario = Escaner.leerCadena();
				}while(nombreUsuario.equals(""));

				//Comprueba que hay libros disponibles para ser prestados.
				for(int i = 0; i < libros.size(); i++) {
					if(libros.get(i).getTitulo().equals(tituloLibro)) {
						if(libros.get(i).getCantidadPrestados() + cantidad <= libros.get(i).getCantidad()){

							//Efectúa el préstamo y actualiza los lobros disponibles
							prestamos.efectuarPrestamo(nombreUsuario, tituloLibro);
							libros.get(i).setCantidadPrestados(cantidad);
							break;

						}else {
							System.out.println("Lo siento, no hay ejemplares disponibles.");
						}
					}
				}


				break;

			}

			//Devolución de préstamos.
			case 5:{

				String nombreUsuario, tituloLibro;
				int cantidad;

				System.out.println("Por favor, introduzca un titulo a continuación.");
				do{

					tituloLibro = Escaner.leerCadena();
				}while(tituloLibro.equals(""));
				System.out.println("Introduzca la cantidad de ejemplares a devolver:");
				do{


					cantidad = Escaner.leerNumero();
				}while(cantidad <= 0);

				System.out.println("Por favor, introduzca el nombre del usuario a continuacion.");
				do{

					nombreUsuario = Escaner.leerCadena();
				}while(nombreUsuario.equals(""));

				//Actualiza la cantidad de ejemplares disponibles.
				for(int i = 0; i < libros.size(); i++) {
					if(libros.get(i).getTitulo().equals(tituloLibro)) {

						libros.get(i).setCantidadPrestados(- cantidad);
						break;
					}
					}
				//Efectúa la devoluón.
				prestamos.efectuarDevolucion(nombreUsuario, tituloLibro);


				break;



			}

			//Aumenta o disminuye la cantidad de ejemplares disponibles de un libro en concreto.
			case 6: {
				String titulo;
				int cantidad;
				System.out.println("Por favor, introduzca un titulo a continuacion.");
				do{

					titulo = Escaner.leerCadena();
				}while(titulo.equals(""));
				System.out.println("Introduzca la cantidad de ejemplares a registrar:");
				do{

					cantidad = Escaner.leerNumero();
				}while(cantidad <= 0);


				for(int i = 0; i < libros.size(); i++) {

					if (libros.get(i).getTitulo().equals(titulo)) {

						libros.get(i).setCantidad(cantidad);

					}
			}break;
			}

			//Lista los préstamos efectuados
			case 7: {

				prestamos.listarPrestamos();
				break;

			}

			//Comprueba y lista los morosos.
			case 8: {

				prestamos.listarMorosos();

			break;

			}
			}
		}while (seleccion != 0);

	}

}
