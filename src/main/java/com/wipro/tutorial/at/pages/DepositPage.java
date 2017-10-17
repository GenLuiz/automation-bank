package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class DepositPage extends AbstractPage {

    @FindBy(className = "sb-content-desc")
    private WebElement pageTitle;

    @FindBy(id = "targetAccount")
    private WebElement CpfElement;

    @FindBy(id="ammount")
    private WebElement inputAmount;

    @FindBy (className = "sb-button")
    private WebElement depositButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public String returnPageTitle(){
        return pageTitle.getText();
    }

    public DepositPage selectAccountDeposit(String cpfNumber){
        Select ownerCpfSelect = new Select(CpfElement);
        ownerCpfSelect.selectByValue(cpfNumber);
        return this;
    }

    public DepositPage inputAmount(String amount){
        inputAmount.sendKeys(amount);
        return this;
    }

    public DepositPage clickDepositButton(){
        depositButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
