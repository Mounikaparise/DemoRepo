package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/java/Features",
   //path of step definition file
   glue = { "stepDefinition"},
   monochrome=true,
   plugin= {"pretty","html:target/report"}
   
   )

public class RunnerClass {

}
