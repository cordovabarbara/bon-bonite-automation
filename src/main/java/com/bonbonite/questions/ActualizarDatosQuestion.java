package com.bonbonite.questions;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ActualizarDatosQuestion {

    public static Question<Boolean> mensajeExitoVisible() {
        return actor -> {
            try {
                return BrowseTheWeb.as(actor)
                        .getDriver()
                        .findElements(
                                org.openqa.selenium.By.xpath(
                                        "//span[contains(text(),'Datos personales actualizados correctamente')]"))
                        .size() > 0;
            } catch (Exception e) {
                return false;
            }
        };
    }
}