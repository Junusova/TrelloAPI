package baseMethods

import domain.CONTENT_TYPE_APPLICATION_URLENCODED
import io.restassured.RestAssured.given

object Authentification {
    fun receiveCookies(): String {
        return given()
            .header(CONTENT_TYPE_APPLICATION_URLENCODED)
         //   .formParam("castleClientId", "c4445374-9d50-43e1-8eac-6ce119902643-35c3ef2f5e29aaca79c3ba63")
            .formParam("factors[password]", "A5VZQsCqNasNXV")
            .formParam("factors[user]", "trello00012@gmail.com")
            .formParam("method", "password")
            .log().all().`when`()
            .post("https://trello.com/1/authentication").then()
            .statusCode(200)
            .extract()
            .path("code")
    }
}