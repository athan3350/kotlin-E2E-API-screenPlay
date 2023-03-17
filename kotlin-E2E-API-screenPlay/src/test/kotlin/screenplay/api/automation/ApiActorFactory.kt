package screenplay.api.automation



import net.serenitybdd.screenplay.Ability

import net.serenitybdd.screenplay.Actor

import net.serenitybdd.screenplay.actors.Cast
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnStage.theActorCalled

import net.serenitybdd.screenplay.rest.abilities.CallAnApi

class ApiActorFactory : Cast() {
    override fun actorNamed(actorName: String?, vararg abilities: Ability?): Actor? {
        return super.actorNamed(actorName, CallAnApi.at("https://jsonplaceholder.typicode.com/"))
    }
}

