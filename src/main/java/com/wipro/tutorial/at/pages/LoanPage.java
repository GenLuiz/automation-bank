package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class LoanPage extends AbstractPage {

    @FindBy(id = "targetAccount")
    private Select targetAccount;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy (className = "sb-button")
    private WebElement makeLoanButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;


    public LoanPage selectAccount(String cpfNumber){
        targetAccount.selectByVisibleText(cpfNumber);
        return this;
    }

    public LoanPage insertAmount(String amount){
        amountInput.sendKeys(amount);
        return this;
    }

    public LoanPage clickMakeLoan(){
        makeLoanButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
