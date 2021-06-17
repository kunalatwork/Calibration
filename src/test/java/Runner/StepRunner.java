package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( glue = "StepDefination", 
                 features="Feature/Calibration.feature",
                 dryRun=false,
                 monochrome=true,
                 plugin= {"html:Calibration/TestReport.html"}
		        )

public class StepRunner {

}
