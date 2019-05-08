package baseMethods

import baseMethods.Authentification.receiveCookies
import baseMethods.GetDscMethods.getHeaderExecutePostApiMethod
import domain.CONTENT_TYPE_APPLICATION_URLENCODED
import io.restassured.RestAssured.given


object testSession {
    fun getSessionExecutePostApiMethod(
    ): String? {
        return given()
            .header(CONTENT_TYPE_APPLICATION_URLENCODED)
            .header("X-Requested-With", "XMLHttpRequest")
            .cookie("dsc", getHeaderExecutePostApiMethod())
            .`when`()
            .post("https://trello.com/1/authorization/session").then().statusCode(200)
            .extract().response().cookie("token")

    }
}