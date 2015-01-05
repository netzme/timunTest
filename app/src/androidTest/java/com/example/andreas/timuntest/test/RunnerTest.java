package com.example.andreas.timuntest.test;

import cucumber.api.CucumberOptions;

/**
 * Created by andreas on 1/2/15.
 */
@CucumberOptions(plugin = {"pretty", "json:sdcard/report/report_test.json" , "junit:sdcard/report/report_test.xml", "html:/sdcard/report/retport_test.html"},features="features", glue="com.example.andreas.timuntest")
public class RunnerTest {
}
