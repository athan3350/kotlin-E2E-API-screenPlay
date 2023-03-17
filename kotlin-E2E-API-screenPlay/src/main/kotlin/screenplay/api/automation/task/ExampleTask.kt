package screenplay.api.automation.task
import io.restassured.RestAssured
import io.restassured.http.ContentType
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task

class ExampleTask() : Task {

    override fun <T : Actor?> performAs(actor: T) {
        RestAssured.given()
            .contentType(ContentType.JSON)
            .get("")
    }

    companion object {
        fun aLaUrl(): ExampleTask {
            return ExampleTask()
        }
    }
}