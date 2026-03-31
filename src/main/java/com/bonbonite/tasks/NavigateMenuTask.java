package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.MenuPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

@Subject("navegar al módulo {0}")
public class NavigateMenuTask implements Task {

    private final Target menuItem;

    public NavigateMenuTask(Target menuItem) {
        this.menuItem = menuItem;
    }

    public static NavigateMenuTask zapatos() {
        return new NavigateMenuTask(MenuPrincipalUI.MENU_ZAPATOS);
    }

    public static NavigateMenuTask bolsos() {
        return new NavigateMenuTask(MenuPrincipalUI.MENU_BOLSOS);
    }

    public static NavigateMenuTask cinturones() {
        return new NavigateMenuTask(MenuPrincipalUI.MENU_CINTURONES);
    }

    public static NavigateMenuTask accesorios() {
        return new NavigateMenuTask(MenuPrincipalUI.MENU_ACCESORIOS);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(menuItem)
        );
        ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver())
                .executeScript("window.scrollTo(0, 800)");
    }
}