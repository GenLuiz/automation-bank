package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.WithdrawnPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WithdrawnSteps extends AbstractSteps {

    @Autowired
    private WithdrawnPage withdrawnPage;

    @Given("I am on withdrawn page")
    public void isOnWithdrawnPage(){
        Assert.assertEquals(withdrawnPage.returnPageTitle(),"Withdraw Amount");
    }

    @When("I select the account I want to withdrawn $cpfNumber")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber){
        withdrawnPage.selectAccount(cpfNumber);
    }

    @When("I fill the amount I want to withdrawn $amount")
    public void userFillAmountInput(@Named("amount") String amount){
        withdrawnPage.inputAmount(amount);
    }

    @When("I click on withdrawn button")
    public void userClicksDeposit(){
        withdrawnPage.clickWithdrawnButton();
    }

    @Then("System should show a withdrawn message $message")
    public void returnMessage(@Named("message") String message){
        Assert.assertEquals(withdrawnPage.getReturnMsg(),message);
    }

}
