package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.AccountInfoPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountInfoSteps extends AbstractSteps {

    @Autowired
    private AccountInfoPage accountInfoPage;

    @Given("I am on account information page")
    public void isOnInfoPage(){
        Assert.assertEquals(accountInfoPage.returnPageTitle(), "Account Information");
    }


    @When("I select my account $cpfNumberInfo")
    public void userSelectInfoAccount(@Named("cpfNumberInfo") String cpfNumber){
        accountInfoPage.selectAccountInfo(cpfNumber);
    }

    @When("I click on get information button")
    public void userClickInfoButton(){
        accountInfoPage.clickInfoButton();
    }

    @Then("system should show my info and a message $message")
    public void returnAccountInfo(@Named("message") String message){
        Assert.assertEquals(accountInfoPage.getReturnMsg(), message);
    }
}
