public class myQuickSort {
	
	public int particion(int [] lista, int ind_menor, int ind_mayor){

		int i = ind_menor - 1;
		int pivote = lista[ind_mayor];

		for(int j = ind_menor; j < ind_mayor; j++){

			if(lista[j] <= pivote){
				i = i + 1;
				int temp = lista[i];
				lista[i] = lista[j];
				lista[j] = temp;
			}
		}

		int temp = lista[i + 1];
		lista[i + 1] = lista[ind_mayor];
		lista[ind_mayor] = temp;

		return i + 1;

	}//Fin del metodo particion


	public void sort(int [] lista, int ind_menor, int ind_mayor){

		if(ind_menor < ind_mayor){

			int pivote = particion(lista, ind_menor, ind_mayor);
			sort(lista, ind_menor, pivote - 1);
			sort(lista, pivote + 1, ind_mayor);
		}
	}//Fin del metodo sort

}
