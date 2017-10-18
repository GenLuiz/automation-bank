package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.LoanPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanSteps extends AbstractSteps {

    @Autowired
    private LoanPage loanPage;

    @Given("User is on loan page")
    public void isOnLoanPage(){
        loanPage.selectLoanMenu();
    }

    @When("loan page loads")
    public void loanPageLoad(){
        loanPage.selectLoanSubMenu();
        Assert.assertEquals(loanPage.returnPageTitle(), "Credit Operations: Get Loan");
    }

    @When("User select his account $cpfNumber")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber){
        loanPage.selectAccount(cpfNumber);
    }

    @When("User fill the amountInput $amountValue")
    public void userFillLoanAmount(@Named("amountValue") String amount){
        loanPage.insertAmount(amount);
    }

    @When("User clicks on makeLoanButton")
    public void userClicksLoanButton(){
        loanPage.clickMakeLoan();
    }

    @Then("the system should show the message $message")
    public void returnMessage(@Named("message") String message){
        Assert.assertEquals(loanPage.getReturnMsg(),message);
    }

}
