package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class LoanPage extends AbstractPage {

    @FindBy(className = "sb-content-desc")
    private WebElement pageTitle;

    @FindBy(xpath = "/html/body/div[1]/dl[2]/dt/a")
    private WebElement loanMenu;

    @FindBy(xpath = "//*[@href='loan']")
    private WebElement loanSubmenu;

    @FindBy(id = "targetAccount")
    private WebElement targetAccount;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy (className = "sb-button")
    private WebElement makeLoanButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;


    public String returnPageTitle(){
        return pageTitle.getText();
    }

    public LoanPage selectLoanMenu(){
        loanMenu.click();
        return this;
    }

    public LoanPage selectLoanSubMenu(){
        loanSubmenu.click();
        return this;
    }

    public LoanPage selectAccount(String cpfNumber){
        Select ownerCpfSelect = new Select(targetAccount);
        ownerCpfSelect.selectByValue(cpfNumber);
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
