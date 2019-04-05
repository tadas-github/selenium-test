package us.connectt.tools.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.connectt.tools.steps.base.BaseStep;

import static org.junit.Assert.assertTrue;
import static us.connectt.tools.assertion.CustomAssert.elementIsPresent;
import static us.connectt.tools.factory.PagesFactory.onLandingPage;
import static us.connectt.tools.factory.PagesFactory.onNavigation;

public class LandingPageStepDefinition {

    private WebDriver driver;

    public LandingPageStepDefinition(BaseStep baseStep) {
        this.driver = baseStep.driver;
    }

    @Given("^I have navigated to the landing page \"([^\"]*)\"$")
    public void iHaveNavigatedToTheLandingPage(String url) {
        onNavigation().navigateTo(url);
    }

    @When("^I pressed on the login button$")
    public void iPressedOnTheLoginButton() {
        onLandingPage().goToLoginPage();
    }

    @Then("^I should be redirected to the login page$")
    public void iShouldBeRedirectedToTheLoginPage() {
        assertTrue(elementIsPresent(driver, By.id("login-page-email")));
    }
}
