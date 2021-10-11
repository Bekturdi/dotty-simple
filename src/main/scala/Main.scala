import cats.effect._

object Main extends IOApp.Simple {
  val run = IO.println("Hello 1") flatMap { _ =>
    IO.println("Hello 2")
  }
}
