package screenplay.api.automation.step_definitions

import io.cucumber.java.en.Given
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.rest.interactions.Get
import screenplay.api.automation.ApiActorFactory

class GeneralSteps {

    @Given("{word} is a YEPEX's user")
    fun initializeActor(actorName: String?) {
        println("Entrando")

        OnStage.setTheStage(ApiActorFactory())
        OnStage.theActorCalled("Actor 1")
        OnStage.theActorInTheSpotlight().remember("key", "value 1")
        OnStage.theActorCalled("Actor 2")
        OnStage.theActorInTheSpotlight().remember("key", "value 2")

        OnStage.withCurrentActor(Get.resource("todos/1"))



    }
}