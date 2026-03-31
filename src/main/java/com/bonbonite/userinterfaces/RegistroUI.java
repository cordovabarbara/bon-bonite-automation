package com.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUI {

    // ─REGISTRO
    public static final Target LINK_REGISTRATE =
            Target.the("link registrate")
                    .locatedBy("//span[@id='show_register']");

    public static final Target CAMPO_CEDULA=
            Target.the("campo cedula")
                    .locatedBy("//input[@id='reg_username']");

    public static final Target CAMPO_NOMBRE =
            Target.the("campo nombre de usuario")
                    .locatedBy("//input[@id='first_name']");

    public static final Target CAMPO_APELLIDOS = Target.the("campo appelidos")
            .locatedBy("//input[@id='last_name']");

    public static final Target CAMPO_EMAIL =
            Target.the("campo email")
                    .locatedBy("//input[@id='reg_email']");

    public static final Target CAMPO_PASSWORD =
            Target.the("campo contraseña")
                    .locatedBy("//input[@id='reg_password']");

    public static final Target CONFIRMAR_PASSWORD = Target.the("campo confirmar contraseña")
            .locatedBy("//input[@id='reg_password2']");

    public static final Target CHECKBOX_NEWSLETTER = Target.the("checkbox de newsletter")
            .locatedBy("//input[@id='newsletter_authorization']");

    public static final Target CHECKBOX_POLITICA = Target.the("checkbox de política de privacidad")
            .locatedBy("//input[@id='privacy_policy_reg']");

    public static final Target BOTON_REGISTRARME =
            Target.the("boton registrarme")
                    .locatedBy("//button[@name='register']");

    public static final Target MENSAJE_BIENVENIDA = Target.the("mensaje de bienvenida")
            .locatedBy("//h3[contains(@class,'text-5xl') and contains(.,'Hola')]");
}