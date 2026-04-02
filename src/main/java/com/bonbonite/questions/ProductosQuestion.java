package com.bonbonite.questions;

import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ProductosQuestion {

    public static Question<Boolean> sonVisibles() {
        return actor -> !BrowseTheWeb.as(actor)
                .getDriver()
                .findElements(By.cssSelector("div.group"))
                .isEmpty();
    }
}