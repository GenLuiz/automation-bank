package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class AccountInfoPage extends AbstractPage {

    @FindBy(id = "ownerCpfSelect")
    private WebElement ownerCpfElement;

    @FindBy(className = "sb-content-desc")
    private WebElement pageTitle;

    @FindBy (className = "sb-button")
    private WebElement getInfoButton;

//    @FindBy(xpath = "//*[contains(text(),'Account Number:')]/following-sibling::*[1]")
//    private WebElement cpfInformation;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public String returnPageTitle(){
        return pageTitle.getText();
    }

    public AccountInfoPage selectAccountInfo(String cpfNumber){
        Select ownerCpfSelect = new Select(ownerCpfElement);
        ownerCpfSelect.selectByValue(cpfNumber);
        return this;
    }

    public AccountInfoPage clickInfoButton(){
        getInfoButton.click();
        return this;
    }

//    public String checkInfo(){
//        return cpfInformation.getText();
//    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
