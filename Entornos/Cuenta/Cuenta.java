//Cuenta.java
/* Programa que da forma al objeto Cuenta, similar al funcionamiento
de una cuenta del banco.
Autor: Alvaro Maleno Alferez.
Fecha de creacion: 11/ 04/ 2018. */

//Comienzo de la clase cuenta
public class Cuenta{

  private String titular; //Identificador del tenedor de la Cuenta
  private double saldo; //Cantidad de dinero en Cuenta

  //Metodo constructor por defecto
  public Cuenta(String titular){

    this.titular = titular;
    this.saldo = 0;

  }//Fin del metodo constructor por defecto

  //Metodo constructor completo
  public Cuenta(String titular, double saldo) {

    this.titular = titular;
    this.saldo = saldo;

  }//Fin del metodo constructor completp

  //Metodo para modificar el titular
  public void setTitular(String titular){

    this.titular = titular;

  }//Fin del metodo setTitular

  //Metodo para consultar el titular
  public String getTitular(){

    return this.titular;

  }//Fin del metodo getTitular

  //Metodo para modificar el saldo
  public void setSaldo(double saldo){

    this.saldo = saldo;

  }//Fin del metodo setSaldo

  //Metodo para consultar el saldo
  public double getSaldo(){

    return this.saldo;

  }//Fin del metodo getSaldo

  //Metodo para consultar el estado de la Cuenta
  public String toString(){

    return ("Titular: " + this.titular + ". \n Saldo: " + this.saldo + ".\n");

  }//Fin del metodo toString

  //Metodo para ingresar dinero en Cuenta
  public void Ingresar(double cantidad){
    //Condicion para ingresar: cantidad mayor a 0
    if (cantidad > 0){

      this.saldo += cantidad;

    }//Fin de condicion para ingresar

  }//Fin del metodo Ingresar

  //Metodo para retirar dinero de Cuenta
  public void Retirar(double cantidad){

    //Si el retiro es mayor al saldo la cuenta ha de quedar a 0
    if (cantidad > this.saldo){

      this.saldo = 0;

    }else{
            this.saldo -= cantidad; }//Fin del condicional

  }//Fin del metodo Retirar

}//Fin de la clase Cuenta
