//Clase Lista.java
/* El programa define la clase Lista que permitira crear vectores
numericos de elementos, modificarlos y recuperar la informacion almacenada
en ellos. No se usara la clase Copyof() por considerar que el 0 es un elemento
que puede ser insertado en una lista y el hecho de que Copyof() rellene con 0s
los nuevos espacios puede interferir en la fiabilidad de la clase.
Este programa en fase Beta empleara el 0 como elemento nulo, no obstante,
en versiones posteriores se sugiere crear dos listas separas; una para elementos
negativos y otra para elementos positivos, anyadiendo una ultima para unir ambas listas
en una unica tabla, de forma que el elemento neutro pueda igualmente ser almacenado.
Autor: Alvaro Maleno Alferez
Ultima modificacion: 15/ 04/ 2018 */

public class Lista {

	  private final int LONGITUD = 10;//Longitud que tendra la Lista
	  private int [] lista; //Creacion de la lista sin definir su Longitud

	  //Metodo constructor por defecto. Longitud de 10
	  public Lista(){

	    this.lista = new int[LONGITUD];

	  }//Fin del metodo Lista(Constructor por defecto)

	  //Metodo constructor con seleccion de longitud
	  public Lista(int longitud){

	    this.lista = new int[longitud];
	  }//Fin del metodo constructor Lista con seleccion de longitud

	  //Metodo para otener el numero de elementos de la Lista
	  public int Longitud(){
	    return lista.length;
	  }//Fin del metodo Longitud

	  //Metodo para insertar un elemento al final de la Lista
	  public void InsertaUltimo(int elemento){

	    boolean posicionNulo = false;//Variable bandera
	    //Condicional para verificar si el ultimo elemento esta vacio
	    if(this.lista[this.lista.length - 1] == 0){
	      this.lista[lista.length - 1] = elemento;
	      posicionNulo = true;
	    }else{
	      //En caso de no estar vacio se habra de buscar un elemento vacio
	      for(int i = this.lista.length -1; i != 0; i--){
	        if(this.lista[i] == 0){
	          this.lista[i] = this.lista[this.lista.length - 1];
	          this.lista[this.lista.length - 1] = elemento;
	          posicionNulo = true;
	          break;
	        }//Fin del condicional de busqueda de elemento nulo
	      }//fin del ciclo de busqueda
	    }//Fin del 1er condicional

	    //En caso de no existir elemento nulo se debera anyadir una posicion mas a la lista
	    if(!posicionNulo){
	      int [] listaTemporal = new int[this.lista.length + 1];
	      //ciclo de copia del array
	      for(int x = 0; x < this.lista.length; x++){
	        listaTemporal[x] = this.lista[x];
	      }//fin del ciclo de copia

	      listaTemporal[listaTemporal.length - 1] = elemento;//Se anyade el elemento en ultimo lugar

	      this.lista = new int[listaTemporal.length];//Ampliacion de la longitud de la lista
	      //Ciclo de volcado de la lista temporal en la lista original
	      for(int y = 0; y < listaTemporal.length; y++){
	        this.lista[y] = listaTemporal[y];
	      }//Fin del ciclo de volcado
	    }//Fin del condicional posicion Nula
	  }//Fin del metodo InsertaUltimo

	  //Metodo para insertar un elemento al principio de la Lista
	  public void InsertaPrimero(int elemento){

	    boolean posicionNulo = false;//Variable bandera
	    //Condicional para verificar si el ultimo elemento esta vacio
	    if(this.lista[0] == 0){
	      this.lista[0] = elemento;
	      posicionNulo = true;
	    }else{
	      //En caso de no estar vacio se habra de buscar un elemento vacio
	      for(int i = 0; i < this.lista.length; i++){
	        if(this.lista[i] == 0){
	          this.lista[i] = this.lista[0];
	          this.lista[0] = elemento;
	          posicionNulo = true;
	          break;
	        }//Fin del condicional de busqueda de elemento nulo
	      }//fin del ciclo de busqueda
	    }//Fin del 1er condicional

	    //En caso de no existir elemento nulo se debera anyadir una posicion mas a la lista
	    if(!posicionNulo){
	      int [] listaTemporal = new int[this.lista.length + 1];
	      //ciclo de copia del array
	      for(int x = 1; x < this.lista.length; x++){
	        listaTemporal[x] = this.lista[x - 1];
	      }//fin del ciclo de copia

	      listaTemporal[0] = elemento;//Se anyade el elemento en primer lugar

	      this.lista = new int[listaTemporal.length];//Ampliacion de la longitud de la lista
	      //Ciclo de volcado de la lista temporal en la lista original
	      this.lista = listaTemporal;
	    }//Fin del condicional posicion Nula
	  }//Fin del metodo InsertaPrimero

	  //Metodo para insertar un elemento en un lugar de la lista
	  public void InsertaLugar(int elemento, int lugar){

	    boolean posicionNulo = false;//Variable bandera
	    //Condicional para verificar si el elemento esta vacio
	    if(this.lista.length > lugar && this.lista[lugar - 1] == 0){
	      this.lista[lugar - 1] = elemento;
	      posicionNulo = true;
	    }else{
	      //En caso de no estar vacio se habra de buscar un elemento vacio
	      for(int i = 0; i < this.lista.length; i++){
	        if(this.lista[i] == 0){
	          this.lista[i] = this.lista[lugar - 1];
	          this.lista[lugar - 1] = elemento;
	          posicionNulo = true;
	          break;
	        }//Fin del condicional de busqueda de elemento nulo
	      }//fin del ciclo de busqueda
	    }//Fin del 1er condicional

	    //En caso de no existir elemento nulo se debera anyadir una posicion mas a la lista
	    if(this.lista.length > lugar && !posicionNulo){
	      posicionNulo = true;
	      int [] listaTemporal = new int[this.lista.length + 1];
	      listaTemporal[lugar - 1] = elemento;
	      //ciclo de copia del array
	      for(int x = 0; x < this.lista.length; x++){
	        boolean bandera = false;//Variable bandera
	        //Condicionales de insercion
	        if(!bandera && x != lugar - 1){
	          listaTemporal[x] = this.lista[x];
	        }else if (x == lugar - 1){
	          bandera = true;
	          listaTemporal[x + 1] = this.lista[x];
	        }else if(bandera){
	          listaTemporal[x + 1] = this.lista[x];
	        }//Fin de condicionales de insercion
	      }//fin del ciclo de copia

	      this.lista = new int[listaTemporal.length];//Ampliacion de la longitud de la lista
	      //Ciclo de volcado de la lista temporal en la lista original
	      for(int y = 0; y < listaTemporal.length; y++){
	        this.lista[y] = listaTemporal[y];
	      }//Fin del ciclo de volcado
	    }//Fin del condicional posicion Nula
	    if(!posicionNulo)
	      System.out.println("Error, posicion inexistente.");
	  }//Fin del metodo InsertaLugar

	  //Metodo para anyadir los elementos de una lista al final de la lista del objeto
	  public void AgregarLista(int[] listaNueva){
			int esNulo = 0; //Contador de elementos nulos
			//Lo segundo es reorganizar los terminos y comprobar si hay espacios libres suficientes
			int [] listaTemporal = new int[this.lista.length];//Nueva lista de copia temporal
			int z = 0;//Variable de correccion de lugar
	    //Lo primero es comprobar si la nueva lista cabe en la que ya existe
	    if(this.lista.length >= listaNueva.length){
	      //Lo segundo es reorganizar los terminos y comprobar si hay espacios libres suficientes

	      for(int i = 0; i < this.lista.length; i++){
	        if(this.lista[i] == 0){
	          esNulo += 1;
	        }else{
	          listaTemporal[i - esNulo] = this.lista[i];
	        }//Fin del condicional
	      }//Fin de recuento de elementos nulos y reorganizacion en lista temporal
	      //Ahora es necesario comprobar si la nueva lista cabe en los espacios nulos de la lista anterior

	      if(esNulo >= listaNueva.length){
	        //Se puede proceder a rellenar la lista original con los elementos de la nueva lista
					z = 0;
	        for(int x = listaNueva.length - 1; x >= 0; x--){
	          this.lista[this.lista.length - 1 - z] = listaNueva[x];
	          z += 1;
	        }
	        for(int y = 0; y < this.lista.length  - z; y++){
	          this.lista[y] = listaTemporal[y];
	        }
	      }else{
	        //Si no hay espacio hay que hacerlo

	        this.lista = new int [this.lista.length + listaNueva.length - esNulo];
	        z = 0;
	        for(int x = listaNueva.length - 1; x >= 0; x--){
	          this.lista[this.lista.length - 1 - z] = listaNueva[x];
	          z += 1;
	        }
	        for(int y = 0; y < this.lista.length - z; y++){
	          this.lista[y] = listaTemporal[y];
	        }
	      }//Fin de la comprobacion de espacio libre suficioente y de la adicion de listaNueva
	    }//Fin del condicional de comprobacion de longitud
	  }//Fin del metodo AgregarLista

	  //Metodo para eliminar un elemento de la lista por su posicion
	  public void EliminarElemento(int posicion){

	    if(posicion == -1){

	    	this.lista[this.lista.length - 1] = 0;
	    }else if(this.lista.length > posicion){
	      this.lista[posicion] = 0;
	    }else{
	      System.out.println("Posicion inexistente.");
	    }
	  }//Fin del metodo EliminarElemento

	  //Metodo para obtener un elemento por su posicion
	  public int DarElemento(int posicion){
	    if(this.lista.length > posicion){
	      return this.lista[posicion];
	    }else{
	      System.out.println("Posicion inexistente.");
	    }return -1;
	  }//Fin del metodo DarElemento

	  //Metodo para obtener un elemento por su valor
	  public int EstaElemento(int valor){
	    for(int i = 0; i < this.lista.length; i++){

	      if(this.lista[i] == valor){
	        return i;
	      }
	    }return -1;
	  }//Fin del metodo EstaElemento

	  //Metodo para agrupar elementos de la lista
	  public void Agrupar(){
			//Condicional que verifica si el metodo es llamado por FIFOLista o por LIFOlista
			if(this.lista[0] == 0){
				int [] temporal = new int [this.lista.length - 1];
				for(int i = 1; i < this.lista.length; i++){
					temporal [i - 1] = this.lista[i];

				}
				this.lista = temporal;
			}else{
				int [] temporal = new int [this.lista.length - 1];
				for(int i = 0; i < this.lista.length - 1; i++){
					temporal [i] = this.lista[i];

				}
				this.lista = temporal;
			}//Fin del condicional

}//Fin del metodo Agrupar
	  //Metodo para representar la lista como una cadena de caracteres
	  public void ImprimirLista(){
	  	String resultado = "";
	    for(int i : this.lista){
	     resultado += i + " ";
	    }
	    System.out.println(resultado.trim());
	  }//Fin del metodo ImprimirLista
		//Metodo para obtener la lista
		public int[] getLista(){
			return this.lista;
		}//Fin del metodo getLista
	}//Fin de la clase Lista.java
