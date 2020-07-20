package com.VyTrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/VyTrack.html",
        features = "src\\test\\resources\\features",
        glue = "com\\VyTrack\\step_definitions"



)

public class CukesRunner {
}