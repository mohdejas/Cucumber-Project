package Testrunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = {"src/main/resources/feature1/feature1.feature"},
   //path of step definition file
   glue = "Stepdef1",
		    plugin = {"pretty", "html:target/cucumber-reports.html"},
		    monochrome =true,
		    dryRun =true 
		      
   )

public class Testrunner1 {

}
