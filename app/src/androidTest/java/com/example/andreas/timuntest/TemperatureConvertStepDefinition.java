package com.example.andreas.timuntest;

import android.test.ActivityInstrumentationTestCase2;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by garry on 1/6/15.
 */
public class TemperatureConvertStepDefinition extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity instance;

    public TemperatureConvertStepDefinition() {
        super(MainActivity.class);
    }

    @Given("^Main Activity$")
    public void main_Activity() throws Throwable {
         instance = getActivity();
    }

    @Given("^Temperature in Fahrenheit$")
    public void temperature_in_Fahrenheit() throws Throwable {
        onView(withId(R.id.editTextFahrenheit))
                .perform(typeText("32"));
    }

    @When("^I Was input temperature$")
    public void i_Was_input_temperature() throws Throwable {
        onView(withId(R.id.buttonConvert)).perform(click());
    }

    @Then("^I Should get Temperature in Celcius$")
    public void i_Should_get_Temperature_in_Celcius() throws Throwable {
     onView(withId(R.id.editTextCelcius)).check(matches(withText("0.0")));
    }

}
