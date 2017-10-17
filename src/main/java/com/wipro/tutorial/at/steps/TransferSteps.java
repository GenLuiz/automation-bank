package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.TransferPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferSteps extends AbstractSteps {

    @Autowired
    private TransferPage transferPage;

    @Given("I am on transfer page")
    public void isOnTransferPage(){
        Assert.assertEquals(transferPage.returnPageTitle(),"Transfer Amount Between Accounts");
    }

    @When("I select my account $cpfNumber")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber){
        transferPage.selectMyAccount(cpfNumber);
    }

    @When("I select my friends account $friendCpf")
    public void userSelectTargetAccount(@Named("friendCpf") String cpfNumber){
        transferPage.selectTargetAccount(cpfNumber);
    }

    @When("I fill the amount field $amount")
    public void userFillAmountInput(@Named("amount") String amount){
        transferPage.inputAmount(amount);
    }

    @When("I click on transfer button")
    public void userClicksTransfer(){
        transferPage.clickTransferButton();
    }

    @Then("System should show a message $message")
    public void returnMessage(@Named("message") String message){
        Assert.assertEquals(transferPage.getReturnMsg(), message);
    }
}
