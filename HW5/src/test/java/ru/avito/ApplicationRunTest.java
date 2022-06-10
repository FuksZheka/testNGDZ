package ru.avito;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/ru/avito/features",
        glue = "ru.avito.stepDef",
        tags = "@test"
)
public class ApplicationRunTest {
    @org.junit.Test
    public static void run(String[] args) {
    }
}
