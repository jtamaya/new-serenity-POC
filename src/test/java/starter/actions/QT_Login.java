package starter.actions;

import net.serenitybdd.core.pages.PageObject;

public class QT_Login extends PageObject {

    public void enterCredentials(){
        $("#txtUserName").sendKeys("Username");
        $("#txtPassword").sendKeys("Password");
    }

    public void submitLogin(){
        $("#btnLogin").click();
    }

    public void enterMFACode(){

    }

    public boolean didHomePageLoad(){
        return true;
    }
}
