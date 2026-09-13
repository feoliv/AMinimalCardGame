object CardGame {

  def main(args: Array[String]): Unit = {

    val deck1 = new Deck(
      List(
        Card.Sparkitty,
        Card.Mossling,
        Card("Blaze"),
        Card("Wave"),
        Card("Leaf")
      )
    )

    val deck2 = new Deck(
      List(
        Card.Wetone,
        Card("Flame"),
        Card("Rio"),
        Card("Raiz"),
        Card("Storm")
      )
    )

    val strongest1 = deck1.strongest
    val strongest2 = deck2.strongest

    println(s"Deck 1 strongest: $strongest1")
    println(s"Deck 2 strongest: $strongest2")

    if (strongest1.beats(strongest2)) {
      println(
        s"[${strongest1.name} - (${strongest1.element}] beats [${strongest2.name} - ${strongest2.element}]"
      )
    } else if (strongest2.beats(strongest1)) {
      println(
        s"[${strongest2.name} ${strongest2.element}] beats [${strongest1.name} ${strongest1.element}]!"
      )
    } else {
      println("DRAW") 
    }
  }
}