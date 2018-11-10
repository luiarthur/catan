import org.scalatest.FunSuite

class TestSuite extends FunSuite {
  test("Chit") {
    // Make sure these don't work
    assertThrows[AssertionError] { catan.Chit(0) }
    assertThrows[AssertionError] { catan.Chit(1) }
    assertThrows[AssertionError] { catan.Chit(7) }

    // Make sure these work
    for (v <- (2 to 6)) catan.Chit(v)
    for (v <- (8 to 12)) catan.Chit(v)
  }
}
