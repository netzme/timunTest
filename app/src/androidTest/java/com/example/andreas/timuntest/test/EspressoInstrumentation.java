package com.example.andreas.timuntest.test;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import cucumber.api.android.CucumberInstrumentationCore;

/**
 * Created by garry on 1/5/15.
 */


public class EspressoInstrumentation extends AndroidJUnitRunner {
    private CucumberInstrumentationCore helper = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        helper.create(arguments);
        super.onCreate(arguments);
    }

    @Override
    public void onStart() {
        helper.start();
    }
}
