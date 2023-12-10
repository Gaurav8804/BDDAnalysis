package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".\\src\\test\\java\\featuresFile\\Login.Feature",	//-->(loading the feature file) 
		                                                            //  location of feature file
		glue="StepDefinitions",
		dryRun=true
			)
public class RunnerIO extends AbstractTestNGCucumberTests{
	
	
	
	
	

}
