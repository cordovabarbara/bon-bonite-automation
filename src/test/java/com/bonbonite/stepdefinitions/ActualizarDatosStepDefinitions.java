package com.bonbonite.stepdefinitions;

import com.bonbonite.questions.ActualizarDatosQuestion;
import com.bonbonite.tasks.ActualizarDatosTask;
import com.bonbonite.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ActualizarDatosStepDefinitions {

    @Managed
    WebDriver driver;

    Actor usuario;

    @Before
    public void setUp() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        usuario = Actor.named("Usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("the user navigates to account and logs in")
    public void theUserNavigatesToAccountAndLogsIn() {
        usuario.attemptsTo(
                Open.url("https://www.bon-bonite.com/mi-cuenta/"),
                LoginTask.withCredentials()
        );
    }

    @And("the user updates the account details")
    public void theUserUpdatesAccountDetails() {
        usuario.attemptsTo(ActualizarDatosTask.withNewName());
    }

    @Then("the user should see a success message")
    public void theUserShouldSeeSuccessMessage() {
        usuario.should(seeThat(
                ActualizarDatosQuestion.mensajeExitoVisible(),
                equalTo(true)));
    }
}