/*Clase DemoFIFOLista.java
Programa que muestra la clase LIFOlista. Una pila sencilla que emplea el objeto Lista
El primero en entrar es el primero en salir.
Autor: Alvaro Maleno Alferez
Ultima modificacion: 01/ 05/ 2018*/

public class DemoLIFOLista{

  public static void main(String[] args) {
    Escaner escaner = new Escaner();
    LIFOLista pila = new LIFOLista(1);

    System.out.println("Bienvenido al programa de colas UltraPila.java.\n"+
      " En las proximas lineas te ensenyare el funcionamiento de este\n" +
      "programa desarrollado por la cuasiNasa. Bien, vamos a comenzar con algo sencillito:\n" +
      "cuando pulses la tecla intro empleare mi omnisciencia para crear\n" +
      " una cola de 1 termino en mi memoria, luego\n" +
      "le anyadire un numero  y despues te lo mostrare utilizando el \n" +
      "prodigioso poder de mi ultramemoria semieidetica.");

      	escaner.leerCadena();
        pila.Insertar(1);
        pila.ImprimirLista();

        System.out.println("\nImpresionado verdad?Como?Que significa ese rostro indiferente?\n" +
          "Muy bien, voy a tener que ponerme serio contigo. Ahora, cuando pulses enter, insertare una cantidad\n"+
          "indiscrimanada de numeros y sorpresa, los mostrare todos ordenados a lo quicksort. Lo vas a flipar\n"+
          "chaval.");

          escaner.leerCadena();

        	for(int i = 0; i < 10; i++){

        		pila.Insertar(i * 3);
        	}

        pila.Ordena();
        pila.ImprimirLista();

        System.out.println("\nCOMOOOOOOOOOOOOOOOR? No eres facil de impresionar verdad? Pues ahora le quito a la lista\n" +
      		"un elemento.\n");
          escaner.leerCadena();
          pila.EliminarElemento();
          pila.ImprimirLista();

          System.out.println("\nLo flipas eh? Wahahaha. Sabia que no querrias dejar a la pobre lista sin numeros\n" +
            "Bueno, no te preocupes, en la version de pago estas cosas no pasan. Ale, vaya usted con dios.");


  }

}
