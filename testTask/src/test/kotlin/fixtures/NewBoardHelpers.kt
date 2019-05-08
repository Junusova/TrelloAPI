package fixtures

import baseMethods.testSession.getSessionExecutePostApiMethod
import domain.NewBoardDto

object NewBoardHelpers {
    val board = NewBoardDto(
        name = "Test Board via API",
        prefs_permissionLevel = "private",
        prefs_selfJoin = false,
        defaultLists = false,
        prefs_background_url = "",
        token = getSessionExecutePostApiMethod()
    )
}