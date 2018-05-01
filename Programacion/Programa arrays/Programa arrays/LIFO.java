/*Clase LIFO.java
Programa que crea la clase FIFO. Una cola sencilla.
El primero en entrar es el ultimo en salir.
Autor: Alvaro Maleno Alferes
Ultima modificacion: 18/ 04/ 2018*/
public class LIFO {

	private final int LONGITUD = 1;//Longitud que tendra la Lista
	private int [] lista; //Creacion de la lista sin definir su Longitud
	private int puntero = 0;

	  //Metodo constructor por defecto. Longitud de 10
	  public LIFO(){

	    this.lista = new int[LONGITUD];

	  }//Fin del metodo Lista(Constructor por defecto)

	  //Metodo constructor con seleccion de longitud
	public LIFO(int longitud){

	    this.lista = new int[longitud];
	  }//Fin del metodo constructor Lista con seleccion de longitud

	  //Metodo para insertar al final de la pila un nuevo elemento
	public void Insertar(int numero){
		//Si hay espacio libre se inserta y el puntero se manda a la siguiente posicion
		if(this.puntero < this.lista.length){

			this.lista[puntero] = numero;
			puntero += 1;
		}
		//Si no hay espacio libre se ha de crear antes de insertar el nuevo elemento
		else{
			int [] listaTemporal = new int[lista.length];
			for(int i = 0; i < this.lista.length; i++){
				listaTemporal[i] = this.lista[i];

			}
			this.lista = new int [this.lista.length + 1];
			for(int i = 0; i < this.lista.length - 1; i++){
				this.lista[i] = listaTemporal[i];
			}
			this.lista[puntero] = numero;
			puntero += 1;
		}
	}//Fin del metodo Insertar

	//Metodo para eliminar el elemento en pila LIFO
	public void Eliminar(){

		int [] temporal = new int [this.lista.length - 1];
		for(int i = 0; i < puntero - 1; i++){
			temporal [i] = this.lista[i];

		}
		this.lista = temporal;
		puntero -= 1;
	}//Fin del metodo eliminar

	//Metodo para mostrar el contenido de la lista
	public void Contenido(){

		String resultado = "";
		for(int i : this.lista){
			resultado += i + " ";
		}
		System.out.println(resultado.trim());
	}//Fin del metodo Contenido

	//Metodo para ordenar
	public void Ordena(){
		myQuickSort sort = new myQuickSort();
		sort.sort(this.lista, 0, this.lista.length-1);
	}//Fin del metodo Ordena

}//Fin de la clase LIFO
