package com.co.jbustamante.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/mensaje_makers.feature",
        glue = "com.co.jbustamante.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class MensajeMakersRunner {

}
