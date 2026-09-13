import scala.util.Random

case class Card(
  name: String,
  power: Int,
  element: String
) {
  def beats(other: Card): Boolean = {
    (element, other.element) match {
      case ("Fire", "Grass")  => true
      case ("Grass", "Water") => true
      case ("Water", "Fire")  => true
      case _                  => false
    }
  }
}

object Card {

  def apply(name: String): Card = {

    val elements = Seq("Fire", "Water", "Grass")

    val randomElement = elements(Random.nextInt(elements.length))
    val randomPower = Random.nextInt(10) + 1

    Card(name, randomPower, randomElement)
  }

  def apply(names: Seq[String]): List[Card] = {

  names.map(name => Card(name)).toList

}

  val Sparkitty = Card("Sparkitty", 6, "Fire")
  val Mossling = Card("Mossling", 5, "Grass")
  val Wetone = Card("Wetone", 7, "Water")
}