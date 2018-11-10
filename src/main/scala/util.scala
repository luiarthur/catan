package catan

package object util {
  def nextDouble() = scala.util.Random.nextDouble

  def wsampleIndex(prob:Vector[Double], check:Boolean=true): Int = {
    if (check) prob.foreach{ p => require(p >= 0) }

    val pSum = prob.sum
    val u = nextDouble() * pSum

    def engine(cumsum:Double=prob.head, p:Vector[Double]=prob.tail, i:Int = 0):Int = {
      if (cumsum < u) {
        engine(cumsum + p.head, p.tail, i+1)
      } else {
        i
      }
    }

    engine()
  }

  def wsampleIndexByLogProb(logProb:Vector[Double]): Int = {
    val logProbMax = logProb.max
    val prob = logProb.map(_ - logProbMax)
    wsampleIndex(prob)
  }
}
