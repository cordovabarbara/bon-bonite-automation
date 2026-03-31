package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.ActualizarDatosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Subject("update user account details")
public class ActualizarDatosTask implements Task {

    public static ActualizarDatosTask withNewName() {
        return new ActualizarDatosTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(ActualizarDatosUI.LINK_DATOS, isVisible())
                        .forNoMoreThan(30).seconds(),

                Click.on(ActualizarDatosUI.LINK_DATOS),
                Click.on(ActualizarDatosUI.BOTON_ACTUALIZAR_INFO),

                Clear.field(ActualizarDatosUI.CAMPO_NOMBRE),
                Enter.theValue("Ana").into(ActualizarDatosUI.CAMPO_NOMBRE),

                Clear.field(ActualizarDatosUI.CAMPO_APELLIDO),
                Enter.theValue("Lopez").into(ActualizarDatosUI.CAMPO_APELLIDO),

                Clear.field(ActualizarDatosUI.CAMPO_EMAIL),
                Enter.theValue("lol789456@test.com").into(ActualizarDatosUI.CAMPO_EMAIL),

                Click.on(ActualizarDatosUI.BOTON_GUARDAR)
        );
    }
}