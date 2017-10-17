package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class WithdrawnPage extends AbstractPage {

    @FindBy(className = "sb-content-desc")
    private WebElement pageTitle;

    @FindBy(id = "targetAccount")
    private WebElement ownerCpfElement;

    @FindBy(id="ammount")
    private WebElement inputAmount;

    @FindBy (className = "sb-button")
    private WebElement withdrawnButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public String returnPageTitle(){
        return pageTitle.getText();
    }

    public WithdrawnPage selectAccount(String cpfNumber){
        Select ownerCpfSelect = new Select(ownerCpfElement);
        ownerCpfSelect.selectByValue(cpfNumber);
        return this;
    }

    public WithdrawnPage inputAmount(String amount){
        inputAmount.sendKeys(amount);
        return this;
    }

    public WithdrawnPage clickWithdrawnButton(){
        withdrawnButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
