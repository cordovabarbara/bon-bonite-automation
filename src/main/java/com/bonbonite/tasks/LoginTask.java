package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.ActualizarDatosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("login with existing user")
    public class LoginTask implements Task {

        private final String login;
        private final String password;

        public LoginTask(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public static LoginTask using(String login, String password) {
            return new LoginTask(login, password);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(ActualizarDatosUI.ICONO_LOGIN),
                    Enter.theValue(login).into(ActualizarDatosUI.CAMPO_USUARIO),
                    Enter.theValue(password).into(ActualizarDatosUI.CAMPO_PASSWORD),
                    Click.on(ActualizarDatosUI.BOTON_LOGIN)
            );
        }
}