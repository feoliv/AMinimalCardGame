class Deck(val cards: List[Card]) {

  def strongest: Card = {
    cards.maxBy(card => card.power)
  }

  def byElement(element: String): List[Card] = {
    cards.filter(card => card.element == element)
  }

def totalPower: Int = {
  cards.map(_.power).sum
}

def sortedByPower: List[Card] = {
  cards.sortBy(_.power)
}

}

object Deck {

  def apply(names: String*): Deck = {
    val cards = names.map(name => Card(name)).toList
    new Deck(cards)
  }

}