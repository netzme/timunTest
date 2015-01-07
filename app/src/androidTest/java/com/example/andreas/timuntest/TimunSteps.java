package com.example.andreas.timuntest;

import static android.support.test.espresso.Espresso.*;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;

import android.support.test.espresso.action.ViewActions;
import android.test.ActivityInstrumentationTestCase2;

import android.widget.EditText;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by andreas on 1/2/15.
 */
public class TimunSteps extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity instance;

    public TimunSteps() {
        super(MainActivity.class);
    }

    @Given("^I have a MainActivity$")
    public void i_have_a_MainActivity() throws Throwable {
        instance = getActivity();
    }

    @When("^I enter nickname is \"(.*?)\"$")
    public void i_enter_nickname_is(String arg1) throws Throwable {
        ViewInteraction nicknameField = onView(withId(R.id.nickname));
        nicknameField.perform(ViewActions.typeText(arg1));
    }

    @When("^password is empty$")
    public void password_is_empty() throws Throwable {

        ViewInteraction passwordField = onView(withId(R.id.password));
        passwordField.perform(ViewActions.typeText(""));
    }

    @Then("^login button is disable$")
    public void login_button_is_disable() throws Throwable {
        ViewInteraction button = onView(withId(R.id.login_button));

        button.check(matches(not (isEnabled())));
    }

    @When("^nickname is empty$")
    public void nickname_is_empty() throws Throwable {
        ViewInteraction nicknameField = onView(withId(R.id.nickname));

        nicknameField.perform(ViewActions.typeText(""));
    }

    @When("^I fill password field with \"(.*?)\"$")
    public void i_fill_password_field_with(String arg1) throws Throwable {
        ViewInteraction passwordField = onView(withId(R.id.password));

        passwordField.perform(ViewActions.typeText(arg1));
    }

    @Then("^login button is enable$")
    public void login_button_is_enable() throws Throwable {
        ViewInteraction loginButton = onView(withId(R.id.login_button));

        loginButton.check(matches(isEnabled()));
    }

    @When("^I clear nickname$")
    public void i_clear_nickname() throws Throwable {
        ViewInteraction nickname = onView(withId(R.id.nickname));

        nickname.perform(ViewActions.clearText());
    }
}
