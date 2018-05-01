/*Clase LIFOLista.java
Programa que compone la clase LIFOlista. Una pila sencilla que emplea el objeto Lista
El primero en entrar es el ULTIMO en salir.
Autor: Alvaro Maleno Alferez
Ultima modificacion: 01/ 05/ 2018*/


public class LIFOLista extends Lista{


//Metodo constructor por defecto
	public LIFOLista(){

		super();
	}//fin del metodo LIFOlista

//Metodo constructor con seleccion de longitud
	public LIFOLista(int longitud){

		super(longitud);
	}//Fin del metodo FIFOLista

//Metodo para insertar un valor en la pila
	public void Insertar(int valor){

		InsertaUltimo(valor);
	}//Fin del metodo insertar

//Metodo para eliminar un elemento de la pila
	public void EliminarElemento(){

		super.EliminarElemento(- 1);

		super.Agrupar();


	}//Fin del metodo Eliminar

//Metodo para agregar una lista a la pila
	public void AgregarLista(int [] lista){

		super.AgregarLista(lista);
	}//Fin del metodo AgregarLista

//Metodo para obtener un elemento por su posicion
	public int DarElemento(int n){

		return super.DarElemento(n);
	}//fin del metodo DarElemento

//Metodo para ver el contenido de la pila
	public void ImprimirLista(){

		super.ImprimirLista();
	}//Fin del metodo
//Metodo para ordenar la pila de menor a mayor
	public void Ordena(){
		myQuickSort sort = new myQuickSort();
		sort.sort(super.getLista(), 0, super.getLista().length-1);
	}//Fin del metodo Ordena




}//Fin de la clase LIFOlista
