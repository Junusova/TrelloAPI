package baseMethods

import baseMethods.Authentification.receiveCookies
import baseMethods.GetDscMethods.getHeaderExecutePostApiMethod
import domain.CONTENT_TYPE_APPLICATION_URLENCODED
import io.restassured.RestAssured.given
import io.restassured.http.Header


object testSession {
    fun getSessionExecutePostApiMethod(
    ): Header? {
        return given()
            .header(CONTENT_TYPE_APPLICATION_URLENCODED)
            .header("X-Requested-With", "XMLHttpRequest")
            .formParam("authentication", receiveCookies())
            .formParam("dsc", getHeaderExecutePostApiMethod())
            .`when`()
            .post("https://trello.com/1/authorization/session").then()
            .extract().headers().get("token")

    }
}