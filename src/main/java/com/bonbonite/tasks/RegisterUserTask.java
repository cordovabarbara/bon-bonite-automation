package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.MenuPrincipalUI;
import com.bonbonite.userinterfaces.RegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("register a new user")
public class RegisterUserTask implements Task {

    private String cedula;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;

    public RegisterUserTask(String cedula, String nombres, String apellidos, String email, String password) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
    }

    public static RegisterUserTask withValidData() {
        String timestamp = String.valueOf(System.currentTimeMillis());

        return new RegisterUserTask(
                "123456789" + timestamp,
                "Ana" + timestamp,
                "Gomez",
                "test" + timestamp + "@test.com",
                "Test@12345"
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPrincipalUI.MENU_MI_CUENTA),
                Click.on(RegistroUI.LINK_REGISTRATE),
                Enter.theValue(cedula).into(RegistroUI.CAMPO_CEDULA),
                Enter.theValue(nombres).into(RegistroUI.CAMPO_NOMBRE),
                Enter.theValue(apellidos).into(RegistroUI.CAMPO_APELLIDOS),
                Enter.theValue(email).into(RegistroUI.CAMPO_EMAIL),
                Enter.theValue(password).into(RegistroUI.CAMPO_PASSWORD),
                Enter.theValue(password).into(RegistroUI.CONFIRMAR_PASSWORD),
                Click.on(RegistroUI.CHECKBOX_NEWSLETTER),
                Click.on(RegistroUI.CHECKBOX_POLITICA),
                Click.on(RegistroUI.BOTON_REGISTRARME)
        );
    }
}