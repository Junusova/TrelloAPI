package baseMethods

import domain.CONTENT_TYPE_APPLICATION_URLENCODED
import io.restassured.RestAssured.given

private val cookie = Authentification.receiveCookies()

object testSession {
    fun getSessionExecutePostApiMethod(
    ): String {
        return given()
            .header(CONTENT_TYPE_APPLICATION_URLENCODED)
            .header("X-Requested-With", "XMLHttpRequest")
            .formParam("authentication", cookie)
            .formParam("dsc", "47e4bc7c471d5f259c0bec4f46ce61b3ee9d36381a85d5a07e0321d70e9a60eb")
            .log().all().`when`()
            .post("https://trello.com/1/authorization/session").then().log().body()
            .extract()
            .path("code")
    }
}