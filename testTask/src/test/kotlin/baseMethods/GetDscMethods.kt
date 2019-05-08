package baseMethods

import domain.CONTENT_TYPE_APPLICATION_URLENCODED
import io.restassured.RestAssured

object GetDscMethods {
    fun getHeaderExecutePostApiMethod(
    ): String? {
        return RestAssured.given()
            .header(CONTENT_TYPE_APPLICATION_URLENCODED)
            .header("X-Requested-With", "XMLHttpRequest")
            .`when`()
            .get("https://trello.com/login").then().
                statusCode(200).extract().response().cookie("dsc")

    }
}