package com.bonbonite.stepdefinitions;

import com.bonbonite.questions.ProductosQuestion;
import com.bonbonite.tasks.NavigateMenuTask;
import com.bonbonite.tasks.NavigateToHomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class MenuStepDefinitions {

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

    @Given("the user is on the Bon-bonite home page")
    public void theUserIsOnHomePage() {
        usuario.attemptsTo(NavigateToHomeTask.bonbonite());
    }

    @When("the user clicks on the menu {string}")
    public void theUserClicksOnMenu(String menu) {
        switch (menu) {
            case "Zapatos" -> usuario.attemptsTo(NavigateMenuTask.zapatos());
            case "Bolsos" -> usuario.attemptsTo(NavigateMenuTask.bolsos());
            case "Cinturones" -> usuario.attemptsTo(NavigateMenuTask.cinturones());
            case "Accesorios" -> usuario.attemptsTo(NavigateMenuTask.accesorios());
        }
    }

    @Then("the user should see the list of shoes products")
    public void theUserShouldSeeShoeProducts() {
        usuario.should(seeThat(ProductosQuestion.sonVisibles(), equalTo(true)));
    }

    @Then("the user should see the list of bags products")
    public void theUserShouldSeeBagProducts() {
        usuario.should(seeThat(ProductosQuestion.sonVisibles(), equalTo(true)));
    }

    @Then("the user should see the list of belts products")
    public void theUserShouldSeeBeltsProducts() {
        usuario.should(seeThat(ProductosQuestion.sonVisibles(), equalTo(true)));
    }

    @Then("the user should see the list of accessories products")
    public void theUserShouldSeeAccessoriesProducts() {
        usuario.should(seeThat(ProductosQuestion.sonVisibles(), equalTo(true)));
    }
}