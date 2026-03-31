package com.bonbonite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("navigate to Bon-bonite home page")
public class NavigateToHomeTask implements Task {

    public static NavigateToHomeTask bonbonite() {
        return new NavigateToHomeTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.bon-bonite.com/")
        );
    }
}