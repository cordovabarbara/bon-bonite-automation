package com.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ActualizarDatosUI {

    // ── ICONO LOGIN  ────
    public static final Target ICONO_LOGIN =
            Target.the("ícono login header")
                    .locatedBy("//div[@id='toggle-account-menu']//a[@class='hover:opacity-70 transition-all']//*[name()='svg']");

    // ── LOGIN ──
    public static final Target CAMPO_USUARIO =
            Target.the("campo cédula login")
                    .locatedBy("//input[@id='username']");

    public static final Target CAMPO_PASSWORD =
            Target.the("campo contraseña login")
                    .locatedBy("//input[@id='password']");

    public static final Target BOTON_LOGIN =
            Target.the("botón iniciar sesión")
                    .locatedBy("//button[@name='login']");



    // ── DETALLES DE LA CUENTA ─
    public static final Target LINK_DATOS =
            Target.the("link datos")
                    .locatedBy("//a[@href='https://www.bon-bonite.com/mi-cuenta/edit-account/']");

    public static final Target BOTON_ACTUALIZAR_INFO =
            Target.the("botón actualizar información")
                    .locatedBy("//button[contains(@class,'update-info-btn')]");

    public static final Target CAMPO_NOMBRE =
            Target.the("campo nombres")
                    .locatedBy("//input[@name='first_name']");

    public static final Target CAMPO_APELLIDO =
            Target.the("campo apellidos")
                    .locatedBy("//input[@name='last_name']");

    public static final Target CAMPO_EMAIL =
            Target.the("campo correo")
                    .locatedBy("//input[@name='aux_email']");

    public static final Target BOTON_GUARDAR =
            Target.the("botón guardar")
                    .locatedBy("//button[contains(@class,'save-info-btn')]");

    public static final Target MENSAJE_EXITO =
            Target.the("mensaje éxito")
                    .locatedBy("//span[contains(text(),'Datos personales actualizados correctamente')]");
}