package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.Assert;
import starter.actions.ButtonActions;

public class ButtonStepDefinitions extends UIInteractions {

    private ButtonActions buttonActions;
    @Given("A user navigates to the DemoQA site")
    public void a_user_navigates_to_the_buttons_page() {
        openUrl("https://demoqa.com/");
        Assert.assertTrue(buttonActions.isElementCardVisible());
        System.out.println(buttonActions.isElementCardVisible());
        System.out.println(buttonActions.getElementCardText());
        buttonActions.clickElementsCard();
        buttonActions.clickButtonsSideBarItem();
    }
    @When("He single clicks a button")
    public void user_click_on_the_single_click_button() {
        buttonActions.singleClickButton();
    }
    @Then("He should see {string}")
    public void user_should_see_and(String singleLabelText) {
        System.out.println(buttonActions.getSingleClickButtonSuccessLabel());
        Assert.assertEquals(singleLabelText, buttonActions.getSingleClickButtonSuccessLabel());
    }
}
