package catan

object Dice {
  lazy val support = (2 to 12).toVector
  lazy val probs = support.map(prob)

  // Prob of x is proportional to
  def pip(x: Int): Int = x match {
    case  2 => 1
    case  3 => 2
    case  4 => 3
    case  5 => 4
    case  6 => 5
    case  7 => 6
    case  8 => 5
    case  9 => 4
    case 10 => 3
    case 11 => 2
    case 12 => 1
  }

  def prob(x: Int): Double = {
    pip(x) / 36.0
  }

  def roll(): Int = {
    util.wsampleIndex(probs)
  }
}
