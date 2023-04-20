package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.Assert;
import starter.actions.QT_Login_Forgot_Password;

public class QT_Login_StepDefinitions extends UIInteractions {

    @Given("A user navigates to QuieTrack.com")
    public void aUserNavigatesToQuieTrackCom() {
        openUrl("https://dev.quietrack.com");
    }

    @When("A user enters the username and password")
    public void aUserEntersTheUsernameAndPassword() {
        System.out.println("enter usernaem and passowrd");
    }

    @Then("A user should see the home page")
    public void aUserShouldSeeTheHomePage() {
        System.out.println("Home Page");
    }

    private QT_Login_Forgot_Password qtLoginForgotPassword = new QT_Login_Forgot_Password();
    @Given("A user is on the Login page")
    public void navigateToLoginPage(){
        openUrl("https://dev.quietrack.com");
    }

    @When("A user click 'Forgot Password'")
    public void handleForgotPassword(){
        qtLoginForgotPassword.clickForgotPassword();
    }

    @Then("The forgot password popup should show")
    public void assertForgotPasswordPopupAppears(){
        Assert.assertTrue(qtLoginForgotPassword.didForgotPasswordPopupShow());
    }


}
