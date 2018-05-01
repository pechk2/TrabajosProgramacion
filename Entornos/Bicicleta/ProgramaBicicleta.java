// ProgramaBicicleta
/* El programa principal que permite la creacion de objetos
de tipo Bicicleta y los manipula.
Autor: Alvaro Maleno Alférez
Fecha de creación : 11/ 04/ 2018*/

public class ProgramaBicicleta{

//Metodo principal del programa
   public static void main(String[] args) {

     Bicicleta miBici1 = new Bicicleta();
     Bicicleta miBici2 = new Bicicleta(2, 2, 2);

     System.out.println(miBici1.toString());
     System.out.println(miBici2.toString());

  }//Fin del cuerpo del programa
}//Fin de la clase ProgramaBicicleta
