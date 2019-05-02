package domain

import io.restassured.http.Header

val CONTENT_TYPE_APPLICATION_URLENCODED = Header( "content-type", "application/x-www-form-urlencoded; charset=UTF-8")
val CONTENT_TYPE_APPLICATION_JSON =  Header("content-type", "application/json")