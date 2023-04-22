import zio._
import zio.http._

import caliban.RootResolver
import caliban._
import caliban.schema.Schema.auto._
import caliban.ZHttpAdapter

case class Queries(
    hello: String
)

object CalibanServer extends ZIOAppDefault {
  val queries = Queries("world")
  val api = graphQL(RootResolver(queries))

  import sttp.tapir.json.zio._

  override def run =
    (for {
      interpreter <- api.interpreter
      _ <- Server
        .serve(
          Http
            .collectRoute[Request] { case _ -> !! / "graphql" =>
              ZHttpAdapter.makeHttpService(interpreter)
            }
            .withDefaultErrorResponse
        )
    } yield ())
      .provide(Server.defaultWithPort(8000))
      .exitCode
}
