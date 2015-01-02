package com.example.andreas.timuntest;

import android.test.ActivityInstrumentationTestCase2;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by andreas on 1/2/15.
 */
public class TimunSteps extends ActivityInstrumentationTestCase2<MainActivity> {

    public TimunSteps() {
        super(MainActivity.class);
    }

    @Given("^I have a test$")
    public void i_have_a_test() throws Throwable {
// Write code here that turns the phrase above into concrete actions

    }

    @When("^I test$")
    public void i_test() throws Throwable {
// Write code here that turns the phrase above into concrete actions
    }

    @Then("^I succeed$")
    public void i_succeed() throws Throwable {
// Write code here that turns the phrase above into concrete actions
        assertNotNull(getActivity());
    }
}
