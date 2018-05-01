//Clase Bicicleta
/*El programa define el objeto Bicicleta, su contruccion y sus atributos
Autor: Alvaro Maleno Alferez
Fecha de creación: 11/ 04/ 2018 */
public class Bicicleta {

  private int velocidadActual,
              platoActual,
              pinonActual;
//Metodo constructor por defecto
  public  Bicicleta (){

    this.velocidadActual = 1;
    this.platoActual = 1;
    this.pinonActual = 1;

  } //Fin del metodo constructor por defecto

//Metodo constructor con introduccion de parametros
 public Bicicleta (int velocidadActual, int platoActual, int pinonActual){

   this.velocidadActual = velocidadActual;
   this.platoActual = platoActual;
   this.pinonActual = pinonActual;

 }//Fin del metodo constructor con seleccion de parametros

//Metodo acelearar
 public void Acelerar() {

   this.velocidadActual *= 2;

 }//Fin del metodo acelearar

 //Metodo frenar
 public void Frenar() {

   this.velocidadActual = velocidadActual / 2;

 }//Fin del metodo frenar

//Metodo Cambiar pinon
public  void Cambiarpinon(int pinon) {

  this.pinonActual = pinon;

} //Fin del metodo Cambiar pinon

//Metodo para cambiar el plato
public void CambiarPlato(int plato) {

  this.platoActual = plato;

} //Fin del metodo CambiarPlato

//Metodo para imprimir el estado de la Bicicleta
public String toString(){

  return("Velocidad = " + this.velocidadActual + ". \n Plato actual = " + this.platoActual + ". \n Pinon actual = " + this.pinonActual + ".");

}//Fin del metodo toString

}//Fin de la clase Bicicleta
