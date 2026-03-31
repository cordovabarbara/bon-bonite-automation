package com.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPrincipalUI {

    public static final Target MENU_ZAPATOS =
            Target.the("menú Zapatos")
                    .locatedBy("//a[contains(text(),'Zapatos') and not(ancestor::ul[contains(@class,'sub')])]");

    public static final Target MENU_BOLSOS =
            Target.the("menú Bolsos")
                    .locatedBy("//a[normalize-space(text())='Bolsos' and not(ancestor::ul[contains(@class,'sub')])]");

    public static final Target MENU_MI_CUENTA =
            Target.the("menú Mi cuenta")
                    .locatedBy("//a[contains(@href,'mi-cuenta')]");

    public static final Target MENU_PQRS =
            Target.the("menú PQRS")
                    .locatedBy("//a[contains(text(),'PQRS')]");
}