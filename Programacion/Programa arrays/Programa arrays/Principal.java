public class Principal {


	public static void main(String[] args){
    //Declaración de variables
  int seleccion, posicion, longitud, valor, elementos, contador;
	Lista lista = new Lista();
	FIFOLista cola = new FIFOLista();
	LIFOLista pila = new LIFOLista();
	Escaner escaner = new Escaner();

    System.out.println("Bienvenido al programa de listas UltraLista.java.\n"+
    	" En las proximas lineas te ensenyare el funcionamiento de este\n" +
    	"programa desarrollado por la casiNasa. Bien, vamos a comenzar con algo sencillito:\n" +
    	"cuando pulses la tecla intro empleare mi omnisciencia para crear\n" +
    	" una lista de 10 terminos en mi memoria, luego\n" +
    	"le anyadire un numero al principio y otro al final y despues te la mostrare utilizando el \n" +
    	"prodigioso poder de mi ultramemoria semieidetica.");

    	escaner.leerCadena();

    	lista.InsertaUltimo(6);
    	lista.InsertaPrimero(1);
    	lista.ImprimirLista();

    	System.out.println("\nImpresionado ¿verdad?¿Como?¿Que significa ese rostro indiferente?\n" +
    		"Muy bien, voy a tener que ponerme serio contigo. Ahora, cuando pulses enter, insertare una lista\n"+
    		"de diez elementos al final de la anterior y sorpresa, los mostrare todos ordenados. Lo vas a flipar\n"+
    		"chaval.");
    	escaner.leerCadena();
    	int [] nuevaLista = new int[10];
    	for(int i = 0; i < 10; i++){

    		nuevaLista[i] = i * 3;
    	}
    	lista.AgregarLista(nuevaLista);
    	lista.ImprimirLista();

    	System.out.println("\n¿COMOOOOOOOOOOOOOOOR? No eres facil de impresionar ¿verdad? Pues ahora le quito a la lista\n" +
    		"un elemento. ¿Cual? El que ocupa la 3a posicion.");
    	lista.EliminarElemento(3);
    	lista.ImprimirLista();
    	System.out.println("\nLo flipas ¿eh? Wahahaha. Sabia que no querrias dejar a la pobre lista sin numeros\n" +
    		"Bueno, no te preocupes, ahora le agregare un elemento en la 6 posicion. Sera el numero 5. Me gusta ese numero.");
    	System.out.println("No seas timido chaval, pulsa intro...");
    	escaner.leerCadena();
    	lista.InsertaLugar(5, 6);
    	lista.ImprimirLista();
    	System.out.println("\nLo se, lo estas flipando en colores. Pues aun hay mas, podria decirte que numero\n"
    		+ "ocupa una determinada posicion en la lista, pero eso lo dejare para la version de pago.\n" +
    		"Wahahahahah");

				//Ciclo que compone el menú de opiones. El programa finaliza al pulsar el 0.
		    do {

		      System.out.println("Por favor, seleccione una de las siguientes opciones:\n");
		      System.out.println("1: Crear una lista de 10 elementos.");
		      System.out.println("2: Crear una lista insertando el numero de elementos.");
		      System.out.println("3: Obtener el numero de elementos de la lista.");
		      System.out.println("4: Insertar un elemento en el ultimo lugar.");
		      System.out.println("5: Insertar un elemento en primer lugar.");
		      System.out.println("6: Insertar un elemento en un lugar determinado.");
		      System.out.println("7: Agregar una lista al final de la existente.");
		      System.out.println("8: Eliminar elemento por posicion.");
		      System.out.println("9: Buscar elemento por posicion.");
		      System.out.println("10: Transcribir lista a cadena de caracteres.");
		      System.out.println("11: Crear cola FIFO.");
		      System.out.println("12: Insertar elemento en cola FIFO.");
		      System.out.println("13: Eliminar elemento en cola FIFO.");
		      System.out.println("14: Agregar lista a cola FIFO.");
		      System.out.println("15: Obtener elemento de cola FIFO.");
		      System.out.println("16: Transcribir cola FIFO a cadena de caracteres.");
		      System.out.println("17: Crear pila LIFO.");
		      System.out.println("18: Insertar elemento en pila LIFO.");
		      System.out.println("19: Eliminar elemento en pila LIFO.");
		      System.out.println("20: Agregar lista a pila LIFO.");
		      System.out.println("21: Obtener elemento de pila LIFO.");
		      System.out.println("22: Transcribir pila LIFO a cadena de caracteres.");
		      System.out.println("0: Salir.");

		      seleccion = Escaner.leerNumero();

		      //switch como método de iniciación de acciones
		      switch (seleccion) {

		      //Salida del programa
		      case 0: {

		        System.out.println("Gracias por su paciencia. Hasta la proxima.");
		        System.exit(0);

		      }

		      //Crear una lista, metodo por defecto.
		      case 1:{


		        lista = new Lista();
		        break;


		      }

		      //Crear una lista introduciendo el numero de elementos
		      case 2: {

		      System.out.println("Por favor, introduzca un numero de elementos mayor a 0:");



		        elementos = Escaner.leerNumero();
		        lista = new Lista(elementos);
						break;

		      }

		      //Obtener el numero de elementos de una lista
		      case 3: {

		      System.out.println("La lista contiene " + lista.Longitud() + " elementos.");
					break;
		      }

		      //Insertar un elemento en el ultimo lugar
		      case 4: {


		        System.out.println("Por favor, el valor a insertar.");


		        valor = Escaner.leerNumero();

		        lista.InsertaUltimo(valor);

		        break;

		      }

		      //Insertar un elemento en primer lugar.
		      case 5:{

		        System.out.println("Por favor, el valor a insertar.");


		        valor = Escaner.leerNumero();

		        lista.InsertaPrimero(valor);

		        break;


		      }

		      //Insertar un elemento en el lugar determinado.
		      case 6: {


		        System.out.println("Por favor, introduzca un valor a insertar.");


		        valor = Escaner.leerNumero();


		        System.out.println("Introduzca la posicion en la que lo quiere insertar:");


		        posicion = Escaner.leerNumero();


		        lista.InsertaLugar(valor, posicion);
		      break;
		      }

		      //Agregar una lista al final de la lista existente
		      case 7: {
		        System.out.println("Por favor, introduzca la longitud de la lista.");


		        longitud = Escaner.leerNumero();

		        int [] listaInsertar = new int[longitud];
		        contador = 0;
						if(longitud > 0){
							do{
			          System.out.println("Por favor, introduzca un valor.");
			          valor = Escaner.leerNumero();
			          listaInsertar[contador] = valor;
			          contador += 1;
			        }while(contador < longitud);

			        lista.AgregarLista(listaInsertar);
						}

		        break;
		      }

		      //Eliminar elemento por posicion.
		      case 8: {

		        System.out.println("Por favor, introduzca la posicion a eliminar.");
		        do{

		        posicion = Escaner.leerNumero();
		        }while(posicion < 0);

		        lista.EliminarElemento(posicion);

		      break;

		      }

		      //Buscar elemento por posicion.
		      case 9: {

		        System.out.println("Por favor, introduzca la posicion a buscar.");
		        do{

		        posicion = Escaner.leerNumero();
		        }while(posicion < 0);

		        System.out.println(lista.EstaElemento(posicion));

		      break;

		      }
		      //Transcribir lista.
		      case 10: {

		        lista.ImprimirLista();

		      break;

		      }
		      //Lista FIFO
		      case 11: {

		        cola = new FIFOLista(1);

		      break;

		      } 
		      //AgregarElementoFIFO
		      case 12: {

		        System.out.println("Por favor, introduzca un valor a insertar.");


		        valor = Escaner.leerNumero();

		        cola.Insertar(valor);

		      break;

		      }
		      //Eliminar elemento FIFO
		       case 13: {

		        cola.EliminarElemento();

		      break;

		      }
		      //AgregarLista a FIFO
		       case 14: {

		        System.out.println("Por favor, introduzca la longitud de la lista.");


		        longitud = Escaner.leerNumero();

		        int [] listaInsertar = new int[longitud];
		        contador = 0;
						if(longitud > 0){
							do{
			          System.out.println("Por favor, introduzca un valor.");
			          valor = Escaner.leerNumero();
			          listaInsertar[contador] = valor;
			          contador += 1;
			        }while(contador < longitud);

			        cola.AgregarLista(listaInsertar);
						}

		      break;

		      }

		      //Buscar elemento por posicion.
		      case 15: {

		        System.out.println("Por favor, introduzca la posicion a buscar.");
		        do{

		        posicion = Escaner.leerNumero();
		        }while(posicion < 0);

		        System.out.println(cola.DarElemento(posicion));

		      break;

		      }

		      //Transcribir lista.
		      case 16: {

		        cola.ImprimirLista();

		      break;

		      }

		      //Lista LIFO
		      case 17: {

		        pila = new LIFOLista(1);

		      break;

		      } 
		      //AgregarElementoLIFO
		      case 18: {

		        System.out.println("Por favor, introduzca un valor a insertar.");


		        valor = Escaner.leerNumero();

		        pila.Insertar(valor);

		      break;

		      }
		      //Eliminar elemento FIFO
		       case 19: {

		        pila.EliminarElemento();

		      break;

		      }
		      //AgregarLista a FIFO
		       case 20: {

		        System.out.println("Por favor, introduzca la longitud de la lista.");


		        longitud = Escaner.leerNumero();

		        int [] listaInsertar = new int[longitud];
		        contador = 0;
						if(longitud > 0){
							do{
			          System.out.println("Por favor, introduzca un valor.");
			          valor = Escaner.leerNumero();
			          listaInsertar[contador] = valor;
			          contador += 1;
			        }while(contador < longitud);

			        pila.AgregarLista(listaInsertar);
						}

		      break;

		      }

		      //Buscar elemento por posicion.
		      case 21: {

		        System.out.println("Por favor, introduzca la posicion a buscar.");
		        do{

		        posicion = Escaner.leerNumero();
		        }while(posicion < 0);

		        System.out.println(pila.DarElemento(posicion));

		      break;

		      }

		      //Transcribir lista.
		      case 22: {

		        pila.ImprimirLista();

		      break;

		      }

		      }
		    }while (seleccion != 0);



  }//Fin de la clase main
}//Fin de la clase Principal
