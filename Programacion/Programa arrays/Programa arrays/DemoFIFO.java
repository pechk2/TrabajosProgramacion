/*Clase FIFO.java
Programa que muestra la clase FIFO. Una pila sencilla.
El primero en entrar es el primero en salir.
Autor: Alvaro Maleno Alferez
Ultima modificacion: 01/ 05/ 2018*/

public class DemoFIFO{

  public static void main(String[] args) {
    Escaner escaner = new Escaner();
    FIFO cola = new FIFO();

    System.out.println("Bienvenido al programa de colas UltraCola.java.\n"+
      " En las proximas lineas te ensenyare el funcionamiento de este\n" +
      "programa desarrollado por la casiNasa. Bien, vamos a comenzar con algo sencillito:\n" +
      "cuando pulses la tecla intro empleare mi omnisciencia para crear\n" +
      " una cola de 1 termino en mi memoria, luego\n" +
      "le anyadire un numero  y despues te lo mostrare utilizando el \n" +
      "prodigioso poder de mi ultramemoria semieidetica.");

      	escaner.leerCadena();
        cola.Insertar(6);
        cola.Contenido();

        System.out.println("\nImpresionado verdad?Como?Que significa ese rostro indiferente?\n" +
          "Muy bien, voy a tener que ponerme serio contigo. Ahora, cuando pulses enter, insertare una cantidad\n"+
          "indiscrimanada de numeros y sorpresa, los mostrare todos ordenados a lo quicksort. Lo vas a flipar\n"+
          "chaval.");

          escaner.leerCadena();

        	for(int i = 0; i < 10; i++){

        		cola.Insertar(i * 3);
        	}

        cola.Ordena();
        cola.Contenido();

        System.out.println("\nCOMOOOOOOOOOOOOOOOR? No eres facil de impresionar verdad? Pues ahora le quito a la lista\n" +
      		"un elemento.\n");
          escaner.leerCadena();

          cola.Eliminar();
          cola.Contenido();

          System.out.println("\nLo flipas eh? Wahahaha. Sabia que no querrias dejar a la pobre lista sin numeros\n" +
            "Bueno, no te preocupes, en la version de pago estas cosas no pasan. Ale, vaya usted con dios.");


  }

}
