package baseMethods

import domain.CONTENT_TYPE_APPLICATION_URLENCODED
import io.restassured.RestAssured
import io.restassured.http.Header

object GetDscMethods {
    fun getHeaderExecutePostApiMethod(
    ): Header? {
        return RestAssured.given()
            .header(CONTENT_TYPE_APPLICATION_URLENCODED)
            .header("X-Requested-With", "XMLHttpRequest")
            .`when`()
            .get("https://trello.com/").then().extract().headers().get("dsc")

    }
}