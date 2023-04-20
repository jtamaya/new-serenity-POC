package starter.actions;

import net.serenitybdd.core.pages.PageObject;

public class QT_Login_Forgot_Password extends PageObject {

    public void clickForgotPassword(){
        $("#lnkforgot").click();
    }

    public boolean didForgotPasswordPopupShow(){

        boolean txtEmail = $("#txtemail").isVisible();
        boolean btnNext = $("#btnnext").isClickable();
        boolean btnCancel = $("#btncancelforgot").isClickable();

        return txtEmail && btnNext && btnCancel;
    }
}
