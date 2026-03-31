package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.ActualizarDatosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;

import java.io.InputStream;
import java.util.Properties;

@Subject("login with existing user")
public class LoginTask implements Task {

    public static LoginTask withCredentials() {
        return new LoginTask();
    }

    private String getProperty(String key) {
        try {
            Properties props = new Properties();
            InputStream input = getClass().getClassLoader()
                    .getResourceAsStream("test.properties");
            props.load(input);
            return props.getProperty(key);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo leer la propiedad: " + key);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ActualizarDatosUI.ICONO_LOGIN),
                Enter.theValue(getProperty("usuario.login"))
                        .into(ActualizarDatosUI.CAMPO_USUARIO),
                Enter.theValue(getProperty("usuario.password"))
                        .into(ActualizarDatosUI.CAMPO_PASSWORD),
                Click.on(ActualizarDatosUI.BOTON_LOGIN)
        );
    }
}