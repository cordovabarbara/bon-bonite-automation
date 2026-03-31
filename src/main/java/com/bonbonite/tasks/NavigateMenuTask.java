package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.MenuPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;

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

    public static NavigateMenuTask miCuenta() {
        return new NavigateMenuTask(MenuPrincipalUI.MENU_MI_CUENTA);
    }

    public static NavigateMenuTask pqrs() {
        return new NavigateMenuTask(MenuPrincipalUI.MENU_PQRS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(menuItem)
        );
    }
}