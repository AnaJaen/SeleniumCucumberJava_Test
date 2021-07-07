package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", //directorio donde están las features
    glue = "steps" //dónde estás las definiciones para los steps de esas features
)

public class runner{

}
