package catan

case class Chit(value:Int) {
  assert(valid)

  def max = 12
  def min = 2
  def robber = 7

  def valid = value match {
    case v if v < min => false
    case v if v > max => false
    case v if v == robber => false
    case _ => true
  }
}
