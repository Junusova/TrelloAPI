package domain

import io.restassured.http.Header

data class NewBoardDto (
    val name: String,
    val prefs_permissionLevel: String,
    val prefs_selfJoin: Boolean,
    val defaultLists: Boolean,
    val prefs_background_url: String,
    val token: String
)