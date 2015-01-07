package com.example.andreas.timuntest;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import cucumber.api.android.CucumberInstrumentationCore;

/**
 * Created by noval on 1/6/15.
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
