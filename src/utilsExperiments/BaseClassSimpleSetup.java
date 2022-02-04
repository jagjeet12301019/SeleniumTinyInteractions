package utilsExperiments;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassSimpleSetup {
		  public WebDriver driver;
		  public BaseClassSimpleSetup(){
		    driver = new ChromeDriver();
		  }
		  public WebDriver getdriver(){
		    if (driver == null){
		      driver = new ChromeDriver();
		      return driver;
		    }else{
		      return driver;
		    }
		  }
}
