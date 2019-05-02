package fixtures

import baseMethods.Authentification
import baseMethods.successfullyLogin
import domain.NewBoardDto

object NewBoardHelpers {
    val board = NewBoardDto(
        name = "Test Board via API",
        prefs_permissionLevel = "private",
        prefs_selfJoin = false,
        defaultLists = false,
        prefs_background_url = "",
        token = "5cc9261510cac5805e530c9c/xNSVWnzf1HXiW5ZhApJMqEmOlfy0cAAJaW9dUeyLxrCeh4uDEtg9FBais90K6oLk"
    )
}