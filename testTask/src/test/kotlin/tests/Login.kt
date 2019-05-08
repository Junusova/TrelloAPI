package tests

import baseMethods.GetDscMethods.getHeaderExecutePostApiMethod
import baseMethods.createBoardNotePostApiMethod
import baseMethods.successfullyLogin.loginExecutePostApiMethod
import baseMethods.testSession.getSessionExecutePostApiMethod
import fixtures.NewBoardHelpers
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class Login {

    @Test
    fun test_00_GetDsc() {
        getHeaderExecutePostApiMethod()

    }

    @Test
    fun test_01_Login() {
        loginExecutePostApiMethod()?.statusCode(200)

    }

    @Test
    fun test_02() {
        getSessionExecutePostApiMethod()
    }


    @Test
    fun test_03_CreateNewBoard() {
        val board = NewBoardHelpers.board
        createBoardNotePostApiMethod(
            requestPayload = board
        )
            .statusCode(200)
    }
}