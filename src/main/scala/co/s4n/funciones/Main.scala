package co.s4n.funciones

import scala.annotation.tailrec

case object Main {
    //Punto 1, función que recibe dos enteros y con ellos calcula el área de un triángulo rectángulo
    def areaTrianguloRectangulo: (Double, Double) => Double = (base:Double, altura:Double) => { (base * altura)/2 }
    //Punto 2, función que recobe un entero y calcula el área de un círculo
    def areaDeUnCirculo: Int => Double = new Function1[Int,Double] {
      def apply(r:Int):Double = {
        scala.math.Pi * scala.math.pow(r,2)
      }
    }
    //Punto 3, función que recibe el devengado y deducciones y retorna el salario
    def calSalario: (Double, Double) => Double = (devengado:Double, deducciones:Double) => {
      devengado-deducciones
    }
    //Punto 4, función que recibe el devengado y deducciones y retorna el salario con un bono del 10%
    def calSalarioBono: (Double, Double) => Double = (devengado:Double, deducciones:Double) => {
      devengado*1.1 - deducciones
    }
    //Punto 5, función que recibe una función para aplicarsela a dos dobles(devengado y deducciones)
    def compSalario(f:(Double,Double)=>Double, devengado:Double, deducciones:Double): Double = f(devengado,deducciones)

    //Punto 6, función que genera funciones con diferentes bonos
    def genCalSalarioBono(bono:Double):(Double, Double) => Double = {
        (devengado:Double,deducciones:Double) => {
          devengado * bono - deducciones
        }
    }
    //Punto 7, usando la función generadora, crear una función literal que da un bono del 5%
    val calSalario5: (Double, Double) => Double = genCalSalarioBono(1.05)

    //Punto 8, usando la función generadora, crear una función literal que da un bono del 20%
    val calSalario20: (Double, Double) => Double = genCalSalarioBono(1.2)


    //Punto 9, función que recibe una clausura y dos valores(devengados y deducciones)
    val bono = 1000
    def calSalarioBonoClausura(devengado:Double, deducciones:Double): Double = {
      devengado * bono - deducciones
    }
    //Punto 10, en pruebas

  //Punto 11, generación de función literal que aplica bono del 15%
  val calSalario15: (Double, Double) => Double = genCalSalarioBono(1.15)

  //Punto 12, generación de función literal que aplica bono del 100%
  val calSalario100: (Double, Double) => Double = genCalSalarioBono(2.0)

  //Punto 15, función que genera el factorial de un número n entero
    def factorial(n:Int):Int = {
      if(n==0) 1
      else if(n == 1) 1
      else n * factorial(n-1)
    }
  //Punto 16, función que genera la serie fibonacci de un número n entero
    def fibo(n:Int): Int = {
      if(n == 0) 0
      else if(n == 1) 1
      else fibo(n-1) + fibo(n-2)
    }
  //Punto 17, función que genera el factorial de un número n entero
    @tailrec
    def factorial2(n:Int, acum:Int): Int = {
      if(n == 0) 1
      else if(n == 1) 1
      else factorial2(n-1,acum*n)
    }

  }
