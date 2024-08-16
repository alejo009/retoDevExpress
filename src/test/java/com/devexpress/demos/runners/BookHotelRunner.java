package com.devexpress.demos.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.devexpress.demos.stepdefinitions"},
        features = "src/test/resources/features/bookHotel.feature",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BookHotelRunner {
}