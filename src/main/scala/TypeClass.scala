class TypeClass extends App {

  sealed trait Json
  final case class JsObject(get: Map[String, Json]) extends Json
  final case class JsString(get: String) extends Json
  final case class JsNumber(get: Double) extends Json
  final case object JsNull extends Json

  trait JsonWriter[A] {
    def write(value: A): Json
  }

  final case class Person(name: String, email: String)

}
