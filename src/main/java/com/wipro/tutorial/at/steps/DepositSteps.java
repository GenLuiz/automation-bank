package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepositSteps extends AbstractSteps {

    @Autowired
    private DepositPage depositPage;

    @Given("I am on deposit page")
    public void isOnDepositPage(){
        Assert.assertEquals(depositPage.returnPageTitle(),"Deposit Amount");
    }

    //Tive que mudar o nome de When para Then porque estava chamando o metodo da account info e nao consegui descobrir o motivo
    @When("I select my account to deposit $cpfNumber")
    public void userSelectDepositAccount(@Named("cpfNumber") String cpfNumber){
        depositPage.selectAccount(cpfNumber);
    }

    @When("I fill the amount field $amount")
    public void userFillAmountInput(@Named("amount") String amount){
        depositPage.inputAmount(amount);
    }

    @When("I click on deposit button")
    public void userClicksDeposit(){
        depositPage.clickDepositButton();
    }

    @Then("System should show a message $message")
    public void returnMessage(@Named("message") String message){
        Assert.assertEquals(depositPage.getReturnMsg(),message);
    }
}
