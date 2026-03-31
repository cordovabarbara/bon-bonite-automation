package com.bonbonite.stepdefinitions;

import com.bonbonite.tasks.RegisterUserTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static com.bonbonite.userinterfaces.RegistroUI.MENSAJE_BIENVENIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import com.bonbonite.questions.WelcomeMessage;


public class RegisterStepDefinitions {
    @Managed
    WebDriver driver;

    Actor usuario;


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        usuario = Actor.named("Usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }


    @When("the user navigates to {string}")
    public void theUserNavigatesTo(String seccion) {
        if (seccion.equals("Mi cuenta")) {
            usuario.attemptsTo(
                    net.serenitybdd.screenplay.actions.Open.url("https://www.bon-bonite.com/mi-cuenta/")
            );
        }
    }

    @And("the user completes the registration form with valid data")
    public void theUserCompletesRegistrationForm() {
        usuario.attemptsTo(RegisterUserTask.withValidData());
    }

    @Then("the user should see a welcome message")
    public void theUserShouldSeeWelcomeMessage() {
        usuario.should(
                seeThat(WelcomeMessage.isVisible())
        );
    }
}
