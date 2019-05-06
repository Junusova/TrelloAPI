package baseMethods

import com.google.gson.Gson
import domain.CONTENT_TYPE_APPLICATION_JSON
import domain.NewBoardDto
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse

fun createBoardNotePostApiMethod(
    requestPayload: NewBoardDto
): ValidatableResponse {
    return given()
        .header(CONTENT_TYPE_APPLICATION_JSON)
        .body(Gson().toJson(requestPayload))
        .log().all().
            `when`()
        .post("https://trello.com/1/boards").
            then()
}