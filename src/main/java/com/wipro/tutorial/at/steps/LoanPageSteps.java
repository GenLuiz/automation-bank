package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.LoanPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanPageSteps extends AbstractSteps {

    @Autowired
    private LoanPage loanPage;


}
