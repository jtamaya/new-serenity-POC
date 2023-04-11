package starter.actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class ButtonActions extends PageObject {

    public boolean isElementCardVisible(){
        return $("//*[@id=\"app\"]/div/div/div[2]/div/div[1]").isVisible();
    }

    public String getElementCardText(){
        return $("//*[@id=\"app\"]/div/div/div[2]/div/div[1]").getText();
    }
    public void clickElementsCard(){
        $("//*[@id=\"app\"]/div/div/div[2]/div/div[1]").click();
    }

    public void clickButtonsSideBarItem(){
        $("//*[@id=\"item-4\"]").click();
    }

    public void doubleClickButton() {
        $("#doubleClickBtn").doubleClick();
    }

    public void singleClickButton() {
        $("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button").click();
    }

    public String getSingleClickButtonSuccessLabel() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return $("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p").waitUntilPresent().getAttribute("innerText");
    }

    public String getDoubleClickButtonSuccessLabel(){
        return $("#doubleClickMessage").waitUntilVisible().getText();
    }

    public String getSingleClickButtonText(){
        return $("//*[@id=\"UpTWx\"]").getValue();
    }
}
