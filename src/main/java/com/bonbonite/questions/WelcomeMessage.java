package com.bonbonite.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.bonbonite.userinterfaces.RegistroUI.MENSAJE_BIENVENIDA;

public class WelcomeMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MENSAJE_BIENVENIDA.resolveFor(actor).isVisible();
    }

    public static WelcomeMessage isVisible() {
        return new WelcomeMessage();
    }
}
