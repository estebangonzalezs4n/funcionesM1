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

}
