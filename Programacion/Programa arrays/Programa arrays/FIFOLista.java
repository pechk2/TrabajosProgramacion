/*Clase FIFOLista.java
Programa que compone la clase FIFOlista. Una COLA sencilla que emplea el objeto Lista
El primero en entrar es el primero en salir.
Autor: Alvaro Maleno Alferez
Ultima modificacion: 01/ 05/ 2018*/

public class FIFOLista extends Lista{


	//Metodo Constructor por defecto
	public FIFOLista(){

		super();
	}//Fin del metodo FIFOLista

//Metodo constructor con seleccion de longitud
	public FIFOLista(int longitud){

		super(longitud);
	}//Fin del metodo FIFOLista

//Metodo para insertar un valor
	public void Insertar(int valor){

		InsertaUltimo(valor);
	}//Fin del metodo insertar

//Metodo para eliminar un elemento de la lista
	public void EliminarElemento(){

		super.EliminarElemento(0);

		super.Agrupar();




	}//Fin del metodo Eliminar

	public void AgregarLista(int [] lista){

		super.AgregarLista(lista);
	}//Fin del metodo AgregarLista

//Metodo para obtener un elemento de la lista por su posicion
	public int DarElemento(int n){

		return super.DarElemento(n);
	}//Fin del metodo DarElemento

//Metodo para mostrar el Contenido de la lista
	public void ImprimirLista(){

		super.ImprimirLista();
	}//Fin del metodo ImprimirLista
	//Metodo para ordenar
	public void Ordena(){
		myQuickSort sort = new myQuickSort();
		sort.sort(super.getLista(), 0, super.getLista().length-1);
	}//Fin del metodo Ordena



}
