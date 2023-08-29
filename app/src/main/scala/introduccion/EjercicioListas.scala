package introduccion

import javax.naming.OperationNotSupportedException

class EjercicioListas(){
  /*
  * Punto 2 repetir lista
  * @param lista Lista a repetir
  * @param n Número de veces a repetir la lista
  * @return Lista repetida n veces
  * @example repetirLista(List(1, 2, 3), 2) = List(List(1,1),List(2,2),List(3,3))
  * @throws IllegalArgumentException si n es negativo
  */
  def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
    var listaRepetida : List[List[Int]] = List()
    val numero_elementos : Int = lista.size
    for (i <- 1 to numero_elementos) {
      var listaInterna : List[Int]= List()
      if(n == 0){
        listaRepetida = List() +: listaRepetida
      }
      else if (n>0){
        for(j <-1 to n ) {
          listaInterna = lista(i-1)+:listaInterna
        }


        listaRepetida = listaInterna +: listaRepetida
      }
      else if(n<0){
        throw new java.lang.IllegalArgumentException("No valores menores de 0")
      }
    }
    return listaRepetida.reverse
  }
  /*
  * Punto 3: Filtrar listas
  * @param criterioIn Criterio de filtrado que puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual"
  * @param n Número a comparar
  * @param lista Lista a filtrar
  * @return Lista filtrada de acuerdo al criterio y n
  * @throws IllegalArgumentException si el criterio no es uno de los valores válidos
  */

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]) : List[Int] = {
    val criterio: String = criterioIn.toLowerCase
    var listaFiltrada : List[Int] = List()
    for(i <- 1 to lista.length){
    if(criterio.equals("mayor")){
      if (n < lista(i-1)) {
        listaFiltrada = lista(i-1) +: listaFiltrada
      }
    }
    else if (criterio.equals("menor")) {
      if (n > lista(i-1)) {
        listaFiltrada = lista(i-1) +: listaFiltrada
      }
      print(listaFiltrada.reverse)
    }
    else if (criterio.equals("mayoroigual")) {
      if (n <= lista(i-1)) {
        listaFiltrada = lista(i-1) +: listaFiltrada
      }
    }
    else if (criterio.equals("igual")) {
      if (n == lista(i-1)) {
        listaFiltrada = lista(i-1) +: listaFiltrada
      }
    }
    else if (criterio.equals("diferente")) {
      if (n != lista(i-1)) {
        listaFiltrada = lista(i-1) +: listaFiltrada
      }
    }
    else if (criterio.equals("menoroigual")) {
      if (n >= lista(i-1)) {
        listaFiltrada = lista(i-1) +: listaFiltrada
      }
    }
      else{
      throw new java.lang.IllegalArgumentException("Mal escrito"+ criterio)

    }
    }

    //Complete el código
    listaFiltrada.reverse
  }
}
