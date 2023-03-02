package com.testers.desktop.regressivo;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features"
}, tags = "@calculadora and not @wip", glue = {"com.testers.desktop"}, dryRun = false)
public class DefinitionTestSuiteRegressivo {
}
