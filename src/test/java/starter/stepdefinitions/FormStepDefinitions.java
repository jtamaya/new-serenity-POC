package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.Assert;
import starter.actions.FormActions;

public class FormStepDefinitions extends UIInteractions {

    private FormActions formActions = new FormActions();
    @Given("a user navigates to the from")
    public void userNavigatesToForm(){
        openUrl("https://demoqa.com/");
        formActions.navigateToForm();
    }

    @When("a user fills out the form and submits it")
    public void userFillsOutForm(){
        formActions.fillFormCorrectly();
    }

    @Then("a user should see text box after submission")
    public void userSeeFormSubmissionSuccess(){
        Assert.assertTrue(formActions.didFormSubmit());
    }
}
