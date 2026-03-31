package com.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPrincipalUI {

    public static final Target MENU_ZAPATOS =
            Target.the("menú Zapatos")
                    .locatedBy("//a[contains(text(),'Zapatos') and not(ancestor::ul[contains(@class,'sub')])]");

    public static final Target MENU_BOLSOS =
            Target.the("menu Bolsos")
                    .locatedBy("//a[normalize-space(text())='Bolsos' and not(ancestor::ul[contains(@class,'sub')])]");

    public static final Target MENU_MI_CUENTA =
            Target.the("menu Mi cuenta")
                    .locatedBy("//a[contains(@href,'mi-cuenta')]");

    public static final Target MENU_CINTURONES =
            Target.the("menu Cinturones")
                    .locatedBy("//a[normalize-space(text())='Cinturones' and not(ancestor::ul[contains(@class,'sub')])]");

    public static final Target MENU_ACCESORIOS =
            Target.the("menu Accesorios")
                    .locatedBy("//a[normalize-space(text())='Accesorios' and not(ancestor::ul[contains(@class,'sub')])]");

}