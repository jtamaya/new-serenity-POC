package starter.actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://demoqa.com/")
public class FormActions extends PageObject {
    private String userName = "Beni Test";
    private String userEmail = "usertest@email.com";
    private String userCurrentAddress = "526 Road Way SW";
    private String userPermanentAddress = "7524 Steet Lane NE";

    public void navigateToForm(){
        $("//*[@id=\"app\"]/div/div/div[2]/div/div[1]").click();
        $("#item-0").click();
    }
    public void fillFormCorrectly(){
        $("#userName").sendKeys(userName);
        $("#userEmail").sendKeys(userEmail);
        $("#currentAddress").sendKeys(userCurrentAddress);
        $("#permanentAddress").sendKeys(userPermanentAddress);
        findBy("#submit").click();
    }

    public boolean didFormSubmit(){
        System.out.println($("#name").getText());
        System.out.println($("#email").getText());
        System.out.println($("#currentAddress").getValue());
        System.out.println($("#permanentAddress").getValue());
        if(
                $("#name").getText().equals("Name:" + userName) &&
                $("#email").getText().equals("Email:" + userEmail) &&
                $("#currentAddress").getValue().equals(userCurrentAddress) &&
                $("#permanentAddress").getValue().equals(userPermanentAddress)
        ){
            return true;
        }
        return false;
    }
}
