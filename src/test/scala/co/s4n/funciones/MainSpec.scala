package co.s4n.funciones

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFlatSpec with Matchers {

  "El área de un tríangulo rectángulo con lados rectos de 3" should " es 4.5" in {
    val lado1:Double = 3
    val lado2:Double = 3

    Main.areaTrianguloRectangulo(lado1,lado2) shouldBe 4.5
  }

  "El area de un círculo con radio 5" should "es 78.5" in {
    val radioCirculo:Int = 5

    math.round(Main.areaDeUnCirculo(radioCirculo)) shouldBe math.round(78.5398163397)

  }

  "El salario con unos devengados de 1000000.0 y unas deducciones de 250000.0" should "es 750000.0" in {
    val devengados:Double = 1000000.0
    val deduccioines:Double = 250000.0

    Main.calSalario(devengados, deduccioines) shouldBe 750000.0
  }

  "El salario con un bono del 10% de unos devengados de 1000000.0 y unas deducciones de 250000.0" should "es 850000" in {
    val devengados:Double = 1000000.0
    val deduccioines:Double = 250000.0

    Main.calSalarioBono(devengados, deduccioines) shouldBe 850000.0
  }

  "Al aplicar la función calSalario con compSalario con unos devengados de 1000000.0 y unas deducciones de 250000.0" should "es 750000.0" in {
    val devengados: Double = 1000000.0
    val deduccioines: Double = 250000.0

    Main.compSalario(Main.calSalario, devengados, deduccioines) shouldBe 750000.0
  }

  "Al aplicar la función calSalarioBono con compSalario con unos devengados de 1000000.0 y unas deducciones de 250000.0" should "es 850000.0" in {
    val devengados: Double = 1000000.0
    val deduccioines: Double = 250000.0

    Main.compSalario(Main.calSalarioBono, devengados, deduccioines) shouldBe 850000.0
  }

  "Al usar la función calSalario5 con unos unos devengados de 1000000.0 y unas deducciones de 250000.0" should " es 800000" in {
    val devengados: Double = 1000000.0
    val deduccioines: Double = 250000.0

    Main.calSalario5(devengados, deduccioines) shouldBe 800000
  }

  "Al usar la función calSalario20 con unos unos devengados de 1000000.0 y unas deducciones de 250000.0" should " es 950000" in {
    val devengados: Double = 1000000.0
    val deduccioines: Double = 250000.0

    Main.calSalario20(devengados, deduccioines) shouldBe 950000
  }


}
