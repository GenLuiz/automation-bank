package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class TransferPage extends AbstractPage {

    @FindBy(className = "sb-content-desc")
    private WebElement pageTitle;

    @FindBy(id = "sourceAccount")
    private WebElement sourceAccount;

    @FindBy(id = "targetAccount")
    private WebElement targetAccount;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy(className = "sb-button")
    private WebElement transferButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public String returnPageTitle(){
        return pageTitle.getText();
    }

    public TransferPage selectMyAccount(String cpfNumber){
        Select myAccount = new Select(sourceAccount);
        myAccount.selectByValue(cpfNumber);
        return this;
    }

    public TransferPage selectTargetAccount(String cpfNumber){
        Select friendAccount = new Select(targetAccount);
        friendAccount.selectByValue(cpfNumber);
        return this;
    }

    public TransferPage inputAmount(String amount){
        amountInput.sendKeys(amount);
        return this;
    }

    public TransferPage clickTransferButton(){
        transferButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }

}

