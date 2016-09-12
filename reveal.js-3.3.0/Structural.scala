object Test {
  def main(args: Array[String]): Unit = {
    val s = new Object {val name = "foo"}
    s.name
  }
}
