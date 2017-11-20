package org.aksdroid.play.perfectwebapp

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class PerfectWebAppGatlingTest extends Simulation {

  val httpProtocol = http
    .baseURL("http://localhost:8080")
    .acceptHeader("application/json")
	//.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
	.acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Gatling")
	//.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn = scenario("PerfectWebAppGatlingTest")
    .repeat(10) {
      exec(http("GET /api/users").get("/api/users"))
    }

  setUp(
    scn.inject(atOnceUsers(1000))
  ).protocols(httpProtocol)
}